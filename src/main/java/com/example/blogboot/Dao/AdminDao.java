package com.example.blogboot.Dao;

import com.example.blogboot.POJO.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @ClassName : Admindao
 * @Author : Administrator
 * @Date: 2021/6/25 21:30
 * @Description :
 */

@Repository
public interface AdminDao {
    int insert(Admin admin);
    int delete(Integer id);
    Admin select(Integer id);
    int update(Admin admin);
    Admin login(String username);


}
