package com.wuqinghai.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName Payment
 * @Description payment表的实体类
 * @Author wuqinghai01
 * @Date 2020/5/27 13:00
 * Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable
{
    private Long id;
    private String serial;
}
