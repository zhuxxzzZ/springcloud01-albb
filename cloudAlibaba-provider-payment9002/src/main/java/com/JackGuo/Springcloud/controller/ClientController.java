package com.JackGuo.Springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/send/{id}")
    public String send(@PathVariable("id") String id){
        String str="Nacos服务提供者："+port+"id为："+id;
        return str;
    }
}
