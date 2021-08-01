package com.JackGuo.Springcloud.controller;


import com.JackGuo.Springcloud.common.Result;
import com.JackGuo.Springcloud.entities.Payment;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;


@RestController
public class ConsumerController {

//    public final  String  PAYMENT_URL="http://localhost:8001";
//    public final  String  PAYMENT_URL="http://cloud-payment-service";
      public final  String  PAYMENT_URL="http://CLOUD-PAYMENT-SERVICE";


    @Resource
    private RestTemplate restTemplate;

    @ApiOperation("Consumer添加")
    @ResponseBody
    @GetMapping("/consumer/insert")
    public Result insertPayment(Payment payment){
       return restTemplate.postForObject(PAYMENT_URL+"/insert",payment,Result.class);
    }


    @ApiOperation("Consumer查询")
    @ResponseBody
    @RequestMapping("/consumer/select/{id}")
    public Result createPayment(@PathVariable("id") Long id){

        return restTemplate.getForObject(PAYMENT_URL+"/select/"+id,Result.class);
    }

}
