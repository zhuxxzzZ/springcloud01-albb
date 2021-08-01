package com.JackGuo.Springcloud.controller;


import com.JackGuo.Springcloud.common.Result;
import com.JackGuo.Springcloud.entities.Payment;
import com.JackGuo.Springcloud.service.impl.PaymentServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


@RestController
public class PaymentController {

    @Resource
    private PaymentServiceImpl paymentService;

    @Resource
    private DiscoveryClient discoveryClient;

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


    @RequestMapping("/getDiscovery")
    public Result getDiscovery(){
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        return new Result(instances);
    }

    @RequestMapping("/show")
    public Result show(){

        return paymentService.show();
    }

    @RequestMapping("/timeOut")
    public Result FeignTimeOut(){

        return paymentService.FeignTimeOut();
    }

}
