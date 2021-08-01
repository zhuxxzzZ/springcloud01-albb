package com.JackGuo.Springcloud.controller;


import com.JackGuo.Springcloud.common.Result;
import com.JackGuo.Springcloud.entities.Payment;
import com.JackGuo.Springcloud.service.impl.PaymentServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@RestController
public class PaymentController {

    @Resource
    private PaymentServiceImpl paymentService;



    @ApiOperation("添加")
    @ResponseBody
    @RequestMapping("/insert")
    public Result insertPayment(@RequestBody Payment payment){

        return paymentService.create(payment);
    }


    @ApiOperation("查询")
    @ResponseBody
    @RequestMapping("/select/{id}")
    public Result createPayment(@PathVariable("id") Long id){

        return paymentService.select(id);
    }

    @RequestMapping("/show")
    public Result show(){

        return paymentService.show();
    }

}
