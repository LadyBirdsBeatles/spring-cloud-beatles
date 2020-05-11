package com.cloud.pandas.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaochen
 */
@RestController
public class ConfigClientController {
    @Value("${spring.application.name}")
    private String applicationname;

    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServer;

    @Value("${server.port}")
    private String port;

    @GetMapping("/")
    public String getConfig() {
        return "applicationname :" + applicationname + "eurekaServer :" + eurekaServer + "port :" + port;
    }

}
