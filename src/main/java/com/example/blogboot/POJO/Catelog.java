package com.example.blogboot.POJO;

/**
 * @ClassName : Catelog
 * @Author : Administrator
 * @Date: 2021/6/25 21:20
 * @Description :
 */
public class Catelog {      //目录实体类
    private Integer id;

    private String name;

    private String keywords;

    private Boolean type;

    private String desci;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public void setDesci(String desci) {
        this.desci = desci;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getKeywords() {
        return keywords;
    }

    public Boolean getType() {
        return type;
    }

    public String getDesci() {
        return desci;
    }

    public Catelog(Integer id, String name, String keywords, Boolean type, String desci) {
        this.id = id;
        this.name = name;
        this.keywords = keywords;
        this.type = type;
        this.desci = desci;
    }
}
