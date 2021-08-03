package com.example.blogboot.Dao;

/**
 * @ClassName : Comment
 * @Author : Administrator
 * @Date: 2021/6/25 21:39
 * @Description :
 */
public interface CommentDao {
    int insert(CommentDao comment);
    int update(CommentDao comment);
    CommentDao select(Integer id);
    int delete(Integer id);

}
