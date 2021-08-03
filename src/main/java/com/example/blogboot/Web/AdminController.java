package com.example.blogboot.Web;

import java.util.Random;
import com.example.blogboot.POJO.Admin;
import com.example.blogboot.POJO.AdminLoginLog;
import com.example.blogboot.Service.impl.AdminLoginLogServiceImpl;
import com.example.blogboot.Service.impl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.HashMap;

/**
 * @ClassName : AdminControler
 * @Author : Administrator
 * @Date: 2021/6/26 16:37
 * @Description :
 */
@Controller
public class AdminController {
    @Autowired
    AdminServiceImpl adminService;
    @Autowired
    AdminLoginLogServiceImpl adminLoginLogService;
    @Autowired
    RedisTemplate redisTemplate;

    @RequestMapping(value = {"/admin/index", "/admin", "/admin/login"})
    public String  toLogin(HttpServletRequest request) {
        String ip = request.getRemoteAddr();
        if(request.getSession().getAttribute("ip").equals(ip)){
            return "index";
        }

//        ModelAndView modelAndView=new ModelAndView("admin/login1");
//        return modelAndView;
        return "#/admin/login2";
    }

    @RequestMapping(value = "/api/loginCheck", method = RequestMethod.POST)
    // 0:用户不存在  1:密码错误 2:登陆成功
    public @ResponseBody
    Object loginCheck
            (HttpServletRequest request, HttpServletResponse response) {
//        String username = obj.getAsString("username");
//        String password = obj.getAsString("password");
        request.getContentType();
        System.out.println(request.getContentType());
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        HashMap<String, String> res = new HashMap<>();
        Admin loginAdmin = adminService.getByusername(username);
        //System.out.println(username+"  "+password);
        if (loginAdmin == null) {
            res.put("statecode", "0");

        } else if (!loginAdmin.getPassword().equals(password)) {
            res.put("statecode", "1");

        } else if (loginAdmin.getPassword().equals(password)) {
            ValueOperations<String, String> operations = redisTemplate.opsForValue();
            int nextid=Integer.parseInt(operations.get("id"))+1;
            operations.append("id",""+nextid);
            String ip = request.getRemoteAddr();
            request.getSession().setAttribute("ip",ip);
            request.getSession().setAttribute("id",loginAdmin.getId());
            AdminLoginLog adminLoginLog = new AdminLoginLog();
            adminLoginLog.setId(nextid);
            adminLoginLog.setAdminid(loginAdmin.getId());
            adminLoginLog.setDate(new Date());
            adminLoginLog.setIp(ip);
            Cookie cookie = new Cookie("Userid", "" + loginAdmin.getId());
            cookie.setMaxAge(3600 * 24);
            response.addCookie(cookie);
            request.getSession().setAttribute("admin", loginAdmin);
            res.put("statecode", "2");
        }
        return res;
    }
    @RequestMapping(value = "/register")
    public String register(HttpServletRequest request) {
        return "admin/register";
    }

    @RequestMapping(value = "/api/registerCheck", method = RequestMethod.POST)
    public @ResponseBody Object registerApi(HttpServletRequest request,
                       HttpServletResponse response) {
        HashMap res=new HashMap();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String verifycode = request.getParameter("verifycode");
        Admin loginAdmin = adminService.getByusername(username);
        String  rverifycode=request.getSession().getAttribute("Valicode").toString();
       // String  verifycode=request.getParameter("ValiImage");
        System.out.println(verifycode);
        System.out.println(username);
        //0=验证码错误  1  用户已存在  2 成功
        if(!verifycode.equals(rverifycode)){
              res.put("statecode","0");
        }
        else if (loginAdmin == null) {
            ValueOperations<String, String> operations = redisTemplate.opsForValue();
            int nextid=Integer.parseInt(operations.get("id"))+1;
            operations.append("id",""+nextid);
            Admin newAdmin = new Admin(nextid, username, password);
            res.put("statecode","2");
            //return res;
        } else {
            res.put("statecode","1");
        }
        return res;
    }

    private Random random = new Random();

    // return "用户名已被注册";
    private int randNum(int begin, int end) {
        return random.nextInt(end - begin) + begin;
    }
        @RequestMapping(value = {"/admin/logout"})
        public String logout
                (HttpServletRequest request,HttpServletResponse response) {
            request.getSession().removeAttribute("admin");
            return "redirect:#/admin";
        }
        @RequestMapping(value = {"/get/{id}"})
    public  Admin getAdmin(@PathVariable ("id") Integer id){
            System.out.println("beifangwenle");
            return adminService.getByid(id);
        }




}
