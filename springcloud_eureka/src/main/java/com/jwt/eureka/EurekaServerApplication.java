package com.jwt.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka启动类
 *
 * Created by ModiCheung on 2018/11/18 23:55
 **/

@SpringBootApplication
@EnableEurekaServer //注册EurekaServer到Spring
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
