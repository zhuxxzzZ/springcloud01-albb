package com.JackGuo.Springcloud.service;

import com.JackGuo.Springcloud.common.Result;
import com.JackGuo.Springcloud.entities.Payment;

public interface PaymentService{


    public Result create(Payment payment);

    public Result select(Long id);

    Result show();

}
