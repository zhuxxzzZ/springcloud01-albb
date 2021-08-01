package com.JackGuo.Springcloud.service.impl;

import com.JackGuo.Springcloud.common.Result;
import com.JackGuo.Springcloud.service.PaymentService;
import org.springframework.stereotype.Service;


@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public Result show() {
        return new Result("cloud-provider-payment8004");
    }
}
