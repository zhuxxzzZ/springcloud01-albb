package com.JackGuo.Springcloud.controller;


import com.JackGuo.Springcloud.common.Result;
import com.JackGuo.Springcloud.service.PaymentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class PaymentController {

    @Resource
    private PaymentService paymentService;


    @RequestMapping("/show")
    public Result show(){

        return paymentService.show();

    }
}
