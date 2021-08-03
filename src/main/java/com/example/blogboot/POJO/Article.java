package com.example.blogboot.POJO;

import java.util.ArrayList;
import java.util.Date;

/**
 * @ClassName : Airtcle
 * @Author : Administrator
 * @Date: 2021/6/25 21:17
 * @Description :
 */
public class Article {  //文章实体类
    private String author;

    private Integer id;

    int like;

    private String title;

    private String keywords;

    private String desci;

    private String pic;

    private Integer click;

    private Date time;

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public String getAuthor() {
        return author;
    }

    public int getLike() {
        return like;
    }

    private Integer catalogId;

    private String content;
    public Article(Integer id, String title, String keywords, String desci, String pic, Integer click, Date time, Integer catalogId, String content) {
        this.id = id;
        this.title = title;
        this.keywords = keywords;
        this.desci = desci;
        this.pic = pic;
        this.click = click;
        this.time = time;
        this.catalogId = catalogId;
        this.content = content;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public void setDesci(String desci) {
        this.desci = desci;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public void setClick(Integer click) {
        this.click = click;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public void setCatalogId(Integer catalogId) {
        this.catalogId = catalogId;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getKeywords() {
        return keywords;
    }

    public String getDesci() {
        return desci;
    }

    public String getPic() {
        return pic;
    }

    public Integer getClick() {
        return click;
    }

    public Date getTime() {
        return time;
    }

    public Integer getCatalogId() {
        return catalogId;
    }

    public String getContent() {
        return content;
    }
}
