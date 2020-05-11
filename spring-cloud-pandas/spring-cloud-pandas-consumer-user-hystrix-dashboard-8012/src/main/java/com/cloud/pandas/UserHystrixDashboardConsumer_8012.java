package com.cloud.pandas;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
  * @Author xiaochen
  * @Description http://127.0.0.1:8012//hystrix 监控
  * @Date 16:41 2020/5/11
  * @Param
  * @Return
  **/
@SpringBootApplication
@EnableHystrixDashboard //开启监控
public class UserHystrixDashboardConsumer_8012 {
    public static void main(String[] args) {
        SpringApplication.run(UserHystrixDashboardConsumer_8012.class, args);
    }
}
