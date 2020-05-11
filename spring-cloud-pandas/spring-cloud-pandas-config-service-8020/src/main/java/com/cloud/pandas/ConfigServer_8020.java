package com.cloud.pandas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServer_8020 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServer_8020.class, args);
    }
}
