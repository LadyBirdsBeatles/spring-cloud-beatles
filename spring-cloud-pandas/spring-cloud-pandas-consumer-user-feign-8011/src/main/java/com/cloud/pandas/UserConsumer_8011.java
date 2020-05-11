package com.cloud.pandas;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * 客服端使用ribbon做负载均衡
 */
@SpringBootApplication
@EnableEurekaClient //服务发现
@EnableFeignClients(basePackages = "com.cloud.pandas")
@ComponentScan("com.cloud.pandas")
public class UserConsumer_8011 {
    public static void main(String[] args) {
        SpringApplication.run(UserConsumer_8011.class, args);
    }
}
