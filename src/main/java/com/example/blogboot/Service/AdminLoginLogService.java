package com.example.blogboot.Service;


import com.example.blogboot.POJO.AdminLoginLog;

/**
 * @ClassName : AdminLoginLogService
 * @Author : Administrator
 * @Date: 2021/7/22 16:00
 * @Description : 登录日志
 */
public interface AdminLoginLogService {
    int insertLog(AdminLoginLog adminLoginLog);
    com.example.blogboot.POJO.AdminLoginLog selectLogByid(Integer id);
}
