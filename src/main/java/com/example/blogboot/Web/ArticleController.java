package com.example.blogboot.Web;

import com.example.blogboot.POJO.Admin;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName : ArticleController
 * @Author : Administrator
 * @Date: 2021/7/30 11:31
 * @Description :
 */
@Controller
@RequestMapping(value = "/article")   //文章管理
public class ArticleController {
    @RequestMapping(value = "/search")      //搜索文章
    public Object articleSearch(HttpServletRequest request, HttpServletResponse response){
        return new Object();
    }
    @RequestMapping(value = "/add")     //添加文章
    public Object articleAdd(HttpServletRequest request, HttpServletResponse response){
        return new Object();
    }
    @RequestMapping(value = "/delete")   //删除
    public Object articleDelete(HttpServletRequest request, HttpServletResponse response){
        return new Object();
    }
    @RequestMapping(value = "/like")   //点赞
    public Object articleLike(HttpServletRequest request, HttpServletResponse response){
        return new Object();
    }
    @RequestMapping(value = "/unlike")   //取消点赞
    public Object articleUnLike(HttpServletRequest request, HttpServletResponse response){
        return new Object();
    }
    @RequestMapping(value = "/star")  //收藏
    public Object articleStar(HttpServletRequest request, HttpServletResponse response){
        return new Object();
    }
    @RequestMapping(value = {"/{id}"})
    public Object getAdmin(@PathVariable("id") Integer id){
        return null;
    }
    @RequestMapping(value = "/list")  //全部帖子
    public Object articleList(HttpServletRequest request, HttpServletResponse response){
        return new Object();
    }

}
