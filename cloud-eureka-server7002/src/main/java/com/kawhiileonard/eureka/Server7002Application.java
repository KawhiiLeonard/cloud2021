package com.kawhiileonard.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @description 主启动类
 * @auth kawhiileonard
 * @date 2021/3/14 11:44
 */
@SpringBootApplication
@EnableEurekaServer
public class Server7002Application {
    public static void main(String[] args) {
        SpringApplication.run(Server7002Application.class, args);
    }
}
