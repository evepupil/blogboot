package com.example.blogboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.nio.charset.Charset;

/**
 * @ClassName : ThymeleafProperties
 * @Author : Administrator
 * @Date: 2021/7/13 10:58
 * @Description :
 */
@ConfigurationProperties(
        prefix = "spring.thymeleaf"
)
public class ThymeleafProperties {
    //private static final Charset DEFAULT_ENCODING;
    public static final String DEFAULT_PREFIX = "classpath:/templates/";
    public static final String DEFAULT_SUFFIX = ".html";
    private boolean checkTemplate = true;
    private boolean checkTemplateLocation = true;
    private String prefix = "classpath:/templates/";
    private String suffix = ".html";
    private String mode = "HTML";
    private Charset encoding;
}