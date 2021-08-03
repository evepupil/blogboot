package com.example.blogboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import javax.sql.DataSource;
import java.io.Serializable;
import java.sql.SQLException;

@SpringBootTest(classes = BlogbootApplication.class)
class BlogbootApplicationTests {

    @Autowired
    DataSource dataSource;
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void contextLoads() throws SQLException {
        boolean result=false;
        try{
            ValueOperations<Serializable, Object> operations = redisTemplate.opsForValue();
            operations.set("1", "2");
            result = true;
        }
        catch (Exception e){
            throw e;
        }
        System.out.println(result);

    }
}
