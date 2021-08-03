package com.example.blogboot.Web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName : CommentController
 * @Author : Administrator
 * @Date: 2021/7/30 11:35
 * @Description :
 */
@Controller
@RequestMapping(value = "/comment")
public class CommentController {
    @RequestMapping(value = "/like")
    public Object commentLike(HttpServletRequest request, HttpServletResponse response){
        return new Object();
    }
    @RequestMapping(value = "/delete")
    public Object commentDelete(HttpServletRequest request, HttpServletResponse response){
        return new Object();
    }
    @RequestMapping(value = "/commenttoo")
    public Object commentCommentToo(HttpServletRequest request, HttpServletResponse response){
        return new Object();
    }
}
