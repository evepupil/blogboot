package com.example.blogboot.POJO;
import java.util.Date;

/**
 * @ClassName : AdminLoginlog
 * @Author : Administrator
 * @Date: 2021/6/25 21:13
 * @Description :
 */
public class AdminLoginLog  {        //用户登录记录实体类
    private long id;
    private Integer Adminid;
    private Date date;
    private String ip;

    public  AdminLoginLog(){

    }
    public AdminLoginLog(long id, Integer adminid, Date date, String ip) {
        this.id = id;
        Adminid = adminid;
        this.date = date;
        this.ip = ip;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setAdminid(Integer adminid) {
        Adminid = adminid;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public long getId() {
        return id;
    }

    public Integer getAdminid() {
        return Adminid;
    }

    public Date getDate() {
        return date;
    }

    public String getIp() {
        return ip;
    }
}
