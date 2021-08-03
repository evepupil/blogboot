package com.example.blogboot.Web;

import com.example.blogboot.Service.impl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

/**
 * @ClassName : UsercenterController
 * @Author : Administrator
 * @Date: 2021/7/23 15:16
 * @Description : 个人中心
 */
@Controller
@RequestMapping(value = "/userCenter")
public class UsercenterController {
    @Autowired
    AdminServiceImpl adminService;
    @RequestMapping(value = "/{userId}")
    public ModelAndView toUserpage(@PathVariable("userId") Integer id,
                                  HttpServletRequest request,
                                  HttpServletResponse response){
//        HttpSession session=request.getSession();
//        if(session.getAttribute("id")!=id){
//            return null;
//        }
        ModelAndView modelAndView=new ModelAndView("#/userCenter/userCenter");
        modelAndView.addObject("admin",adminService.getByid(1));
        return modelAndView;
    }
    @RequestMapping(value = "/headimage")
    public Object headImage (HttpServletRequest request,HttpServletResponse response){
        return null;
    }
    @RequestMapping(value = "/update")
    public Object refresh (HttpServletRequest request,HttpServletResponse response){
        return null;
    }
}
