package com.wuqinghai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName PaymentMain8001
 * @Description 项目启动入口
 * @Author wuqinghai01
 * @Date 2020/5/27 12:44
 * Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient//eureka客户端
//@EnableDiscoveryClient// zookeeper客户端、consul客户端
public class PaymentMain8002 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8002.class);
    }
}
