package com.wuqinghai.springcloud.service.impl;

import com.wuqinghai.springcloud.dao.PaymentDao;
import com.wuqinghai.springcloud.entities.Payment;
import com.wuqinghai.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName PaymentServiceImpl
 * @Description TODO
 * @Author wuqinghai01
 * @Date 2020/5/27 13:04
 * Version 1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment)
    {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id)
    {
        return paymentDao.getPaymentById(id);
    }
}
