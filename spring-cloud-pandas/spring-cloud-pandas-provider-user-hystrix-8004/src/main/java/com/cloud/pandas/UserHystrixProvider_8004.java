package com.cloud.pandas;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;


/**
 * 启动类
 *
 * @author xiaochen
 */
@SpringBootApplication
@EnableEurekaClient //服务启动后注册到eureka中
@EnableDiscoveryClient//服务发现
@EnableCircuitBreaker//添加对熔断的支持
public class UserHystrixProvider_8004 {
    public static void main(String[] args) {
        SpringApplication.run(UserHystrixProvider_8004.class, args);
    }
    //增加servlet
    @Bean
    public ServletRegistrationBean servletRegistration(){
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new HystrixMetricsStreamServlet());
        servletRegistrationBean.addUrlMappings("/actuator/hystrix.stream");
        return servletRegistrationBean;
    }
}
