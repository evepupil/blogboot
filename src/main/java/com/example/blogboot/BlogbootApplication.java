package com.example.blogboot;

import com.example.blogboot.config.MyMVCConfigurerAdapter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Repository;
@MapperScan(annotationClass = Repository.class, basePackages = "com.example.blogboot.Dao")
@SpringBootApplication
public class BlogbootApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {

        SpringApplication.run(BlogbootApplication.class, args);
    }

}
