package com.example.blogboot.Dao;

import com.example.blogboot.POJO.AdminLoginLog;
import org.springframework.stereotype.Repository;

/**
 * @ClassName : AdminLoginlogDao
 * @Author : Administrator
 * @Date: 2021/6/25 21:34
 * @Description :
 */
@Repository
public interface AdminLoginLogDao {
    int insert(AdminLoginLog adminLoginlog);
    int delete(long id);
    AdminLoginLog select(long id);

}
