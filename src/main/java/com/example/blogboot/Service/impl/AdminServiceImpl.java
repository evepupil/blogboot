package com.example.blogboot.Service.impl;
import com.example.blogboot.Service.AdminService;
import com.example.blogboot.Dao.AdminDao;
import com.example.blogboot.POJO.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName : AdminServiceImpl
 * @Author : Administrator
 * @Date: 2021/6/26 16:30
 * @Description :
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminDao adminDao;
    public Admin getByid(Integer id){
        return adminDao.select(id);
    }
    public int register(Admin admin){
        return adminDao.insert(admin);
    }
    public Admin getByusername(String username){
        return adminDao.login(username);
    }
}
