package com.JackGuo.Springcloud.service.impl;

import com.JackGuo.Springcloud.common.Result;
import com.JackGuo.Springcloud.dao.PaymentMapper;
import com.JackGuo.Springcloud.entities.Payment;
import com.JackGuo.Springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentMapper paymentMapper;

    @Value("${server.port}")
    private String serverPort;

    @Override
    public Result create(Payment payment) {


        paymentMapper.create(payment);
        return new Result(serverPort);
    }

    @Override
    public Result select(Long id) {
        List<Payment> select = paymentMapper.select(id);

        return new Result(select+" port:"+serverPort);
    }

    @Override
    public Result show() {
        return new Result("8002");
    }
}
