package com.example.blogboot.Dao;

/**
 * @ClassName : Artcle
 * @Author : Administrator
 * @Date: 2021/6/25 21:36
 * @Description :
 */
public interface ArtcleDao {
    ArtcleDao select(Integer id);
    int update(ArtcleDao artcle) ;
    int insert(ArtcleDao artcle);
    int delete(Integer id);

}
