package com.JackGuo.Springcloud.controller;


import com.JackGuo.Springcloud.common.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerCSController {


    @Autowired
    private RestTemplate restTemplate;

    private final String INVOKE_URL="http://cloud-provider-payment";

    @RequestMapping("/show")
    public Result showZK(){
        return restTemplate.getForObject(INVOKE_URL+"/show",Result.class);
    }
}
