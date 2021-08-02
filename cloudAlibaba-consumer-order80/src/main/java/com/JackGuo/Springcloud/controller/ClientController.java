package com.JackGuo.Springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClientController {

    @Autowired
   private RestTemplate restTemplate;

    @Autowired
   private LoadBalancerClient loadBalancerClient;

    @RequestMapping("/getMsg/{id}")
    public String getMsg(@PathVariable("id") String id){
        ServiceInstance serviceInstance = loadBalancerClient.choose("Alibaba-provider-service");
        String path = String.format("http://Alibaba-provider-service/send/%s",id);
        System.out.println("request path:" +path+serviceInstance.getPort());
        return   restTemplate.getForObject(path,String.class);



    }
}
