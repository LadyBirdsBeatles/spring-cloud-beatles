package com.cloud.pandas;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;


/**
 * 启动类
 *http://beatles.com:8888/pandas/spring-cloud-pandas-provider-user/user/getUid/1
 * @author xiaochen
 */
@SpringBootApplication
@EnableZuulProxy //网管代理
public class UserZuul_8888 {
    public static void main(String[] args) {
        SpringApplication.run(UserZuul_8888.class, args);
    }
   
}
