package com.example.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 启动类
 * 自动创建Spring容器，然后将扫描的包，bean装配到容器中
 * @author hxf
 * @create 2021-09-07 10:51
 */
@SpringBootApplication // 自动配置
public class ServiceUserApplication {
    public static void main(String[] args) {

        SpringApplication.run(ServiceUserApplication.class, args);
    }
}

