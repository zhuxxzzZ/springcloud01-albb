package com.JackGuo.Springcloud.controller;


import com.JackGuo.Springcloud.srvice.ConsumerService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
//@DefaultProperties(defaultFallback = "defaultFallbackMethod")
public class ConsumerController {

    @Resource
    private ConsumerService consumerService;


    @RequestMapping("/show_OK")
   public String show_OK(){
        String s = consumerService.show_OK();
        return s;
    };


    @HystrixCommand(fallbackMethod = "orderInfo_TimeOutHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "5000")
    })
   public @RequestMapping("/show_timeout")
    String show_timeout(){
        String s = consumerService.show_timeout();
        return s;

    };

    public  String  orderInfo_TimeOutHandler(){
        return "消费者降级兜底方法。等待时间过长，已经降级";
    }

    public  String  defaultFallbackMethod(){
        return "全局错误解析";
    }




}
