package com.wuqinghai.springcloud.dao;

import com.wuqinghai.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName PaymentDao
 * @Description payment表的dao类
 * @Author wuqinghai01
 * @Date 2020/5/27 13:00
 * Version 1.0
 */
@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
