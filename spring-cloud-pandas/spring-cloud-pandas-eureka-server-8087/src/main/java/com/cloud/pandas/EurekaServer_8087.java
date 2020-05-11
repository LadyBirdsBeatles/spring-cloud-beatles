package com.cloud.pandas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * 启动类
 *
 * @author xiaochen
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer_8087 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_8087.class, args);
    }

}
