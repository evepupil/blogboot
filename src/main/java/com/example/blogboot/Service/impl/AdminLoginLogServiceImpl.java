package com.example.blogboot.Service.impl;
import com.example.blogboot.Dao.AdminLoginLogDao;
import com.example.blogboot.POJO.AdminLoginLog;
import com.example.blogboot.Service.AdminLoginLogService;
import com.example.blogboot.Dao.AdminLoginLogDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName : AdminLoginLogServiceImpl
 * @Author : Administrator
 * @Date: 2021/7/22 16:03
 * @Description : 登录日志业务实现
 */
@Service
public class AdminLoginLogServiceImpl implements AdminLoginLogService {
    @Autowired
    AdminLoginLogDao adminLoginLogDao;
    @Override
    public int insertLog(AdminLoginLog adminLoginLog) {
        return adminLoginLogDao.insert(adminLoginLog);
    }

    @Override
    public com.example.blogboot.POJO.AdminLoginLog selectLogByid(Integer id) {
        return adminLoginLogDao.select(id);
    }
}
