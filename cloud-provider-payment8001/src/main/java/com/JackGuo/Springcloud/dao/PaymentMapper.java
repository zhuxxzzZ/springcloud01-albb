package com.JackGuo.Springcloud.dao;


import com.JackGuo.Springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 推荐使用Mapper
 */
@Mapper
public interface PaymentMapper {


    int create(Payment payment);

    List<Payment> select(@Param("id") Long id);

}