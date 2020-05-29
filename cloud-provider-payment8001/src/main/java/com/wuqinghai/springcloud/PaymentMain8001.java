package com.wuqinghai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName PaymentMain8001
 * @Description 项目启动入口
 * @Author wuqinghai01
 * @Date 2020/5/27 12:44
 * Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
//@EnableDiscoveryClient
public class PaymentMain8001 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8001.class);
    }
}
