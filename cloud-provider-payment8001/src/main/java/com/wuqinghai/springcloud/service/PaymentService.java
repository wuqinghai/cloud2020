package com.wuqinghai.springcloud.service;

import com.wuqinghai.springcloud.entities.Payment;

/**
 * @ClassName PaymentService
 * @Description TODO
 * @Author wuqinghai01
 * @Date 2020/5/27 13:03
 * Version 1.0
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
