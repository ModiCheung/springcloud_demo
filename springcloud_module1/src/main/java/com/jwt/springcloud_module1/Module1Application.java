package com.jwt.springcloud_module1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Eureka启动类
 *
 * Created by ModiCheung on 2018/11/18 23:55
 **/

@SpringBootApplication
@EnableEurekaClient //注册EurekaClient到Eureka
public class Module1Application {

    public static void main(String[] args) {
        SpringApplication.run(Module1Application.class, args);
    }
}
