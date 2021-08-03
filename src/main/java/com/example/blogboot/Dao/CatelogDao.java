package com.example.blogboot.Dao;

/**
 * @ClassName : CatelogDao
 * @Author : Administrator
 * @Date: 2021/6/25 21:38
 * @Description :
 */
public interface CatelogDao {
    int insert(CatelogDao catelogDao);
    int delete(Integer id);
    CatelogDao select(Integer id);
    int update(CatelogDao catelogDao);

}
