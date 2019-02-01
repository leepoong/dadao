package com.tencent.lp.dadao.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Leepong
 * @date 13:37  2019/2/1
 * @description
 */
@Configuration
public class ExternalResourceConfig implements WebMvcConfigurer {
    private Logger logger = LoggerFactory.getLogger(ExternalResourceConfig.class);
    @Value("${lp.rs.path}")
    private String filePath;
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        System.out.println(filePath);
        registry.addResourceHandler("/rs/**").addResourceLocations("file:" + filePath);

    }
}
