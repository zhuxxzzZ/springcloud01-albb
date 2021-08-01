package com.JackGuo.Springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ClientController {

    @Value("${test}")
    private String configInfo;

    @RequestMapping("/getConfigInfo")
    public String getConfigInfo(){
        return configInfo;
    }
}
