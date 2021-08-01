package com.JackGuo.Springcloud.controller;


import com.JackGuo.Springcloud.common.Result;
import com.JackGuo.Springcloud.service.ConsumerFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerFeignController {

    @Autowired
    private ConsumerFeignService consumerFeignService;


    @RequestMapping("/show")
    public Result show(){
      return   consumerFeignService.show();
    }

    @RequestMapping("/timeOut")
    public Result TimeOut(){
      return   consumerFeignService.FeignTimeOut();
    }
}
