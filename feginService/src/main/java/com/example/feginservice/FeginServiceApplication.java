package com.example.feginservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient     // 注册中心客户端
@EnableFeignClients     // 服务客户端
public class FeginServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeginServiceApplication.class, args);
    }

}
