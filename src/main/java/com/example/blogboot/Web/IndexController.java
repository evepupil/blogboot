package com.example.blogboot.Web;

import com.example.blogboot.POJO.Admin;
import com.example.blogboot.POJO.Article;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Date;

/**
 * @ClassName : IndexController
 * @Author : Administrator
 * @Date: 2021/7/30 10:46
 * @Description :
 */
@Controller
public class IndexController {
    @RequestMapping(value = "/index")
    public ModelAndView toIndex(HttpServletRequest request,
                                HttpServletResponse response){
        Article a=new Article(12,"test","hh","test","564",
                1,new Date(),12,"wjdioawod");
        Article b=new Article(123,"test1","hh1","test1","5614",
                1,new Date(),112,"wjdio11awod");
        ModelAndView modelAndView=new ModelAndView("#/index/index");
        ArrayList<Article> articles=new ArrayList<>();
        articles.add(a);
        articles.add(b);
        modelAndView.addObject("articles",articles);
        Admin admin=new Admin(1,"123","123");
        Admin admin1=new Admin(12,"1323","123");
        ArrayList<Admin> admins=new ArrayList<>();
        admins.add(admin);
        admins.add(admin1);
        modelAndView.addObject("admins",admins);
        return modelAndView;
    }
}
