package com.wuqinghai.springcloud.controller;

import com.wuqinghai.springcloud.entities.CommonResult;
import com.wuqinghai.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName OrderController
 * @Description 订单服务的调用支付服务的接口
 * @Author wuqinghai01
 * @Date 2020/5/27 13:00
 * Version 1.0
 */
@RestController
@Slf4j
public class OrderController
{
    // 接口地址被写死在代码中难以维护
    // public static final String PAYMENT_URL = "http://localhost:8001";

    // 通过服务名从注册中心获取ip信息
    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment)
    {
        return restTemplate.postForObject(PAYMENT_URL +"/payment/create",payment,CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id)
    {
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
    }
}
