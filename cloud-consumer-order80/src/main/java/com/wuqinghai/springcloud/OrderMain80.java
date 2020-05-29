package com.wuqinghai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName OrderMain80
 * @Description 订单服务的启动类
 * @Author wuqinghai01
 * @Date 2020/5/27 13:00
 * Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderMain80
{
    public static void main(String[] args) {
            SpringApplication.run(OrderMain80.class, args);
    }
}
