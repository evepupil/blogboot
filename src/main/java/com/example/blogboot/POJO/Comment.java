package com.example.blogboot.POJO;

import java.util.Date;

/**
 * @ClassName : Comment
 * @Author : Administrator
 * @Date: 2021/6/25 21:22
 * @Description :
 */
public class Comment {         //评论实体类
    private Long id;

    private Long articleId;

    private Date date;

    private String name;

    private String email;

    private String content;
    int like;

    public void setLike(int like) {
        this.like = like;
    }

    public int getLike() {
        return this.like;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public Long getArticleId() {
        return articleId;
    }

    public Date getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getContent() {
        return content;
    }

    public Comment(Long id, Long articleId, Date date, String name, String email, String content) {
        this.id = id;
        this.articleId = articleId;
        this.date = date;
        this.name = name;
        this.email = email;
        this.content = content;
    }
}
