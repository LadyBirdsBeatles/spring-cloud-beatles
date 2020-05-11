package com.cloud.pandas;

import com.cloud.cloudconfig.BeetlesRandomRule;
import com.cloud.cloudconfig.BeetlesRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * 客服端使用ribbon做负载均衡
 */
@SpringBootApplication
@EnableEurekaClient //服务发现
//微服务启动时加载自定义ribbon类
//@RibbonClient(name = "SPRING-CLOUD-PANDAS-PROVIDER-USER",configuration = BeetlesRandomRule.class)
@RibbonClient(name = "SPRING-CLOUD-PANDAS-PROVIDER-USER",configuration = BeetlesRule.class)
public class UserConsumer_8010 {
    public static void main(String[] args) {
        SpringApplication.run(UserConsumer_8010.class, args);
    }
}
