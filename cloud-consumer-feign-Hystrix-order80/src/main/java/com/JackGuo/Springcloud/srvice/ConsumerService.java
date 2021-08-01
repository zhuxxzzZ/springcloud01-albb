package com.JackGuo.Springcloud.srvice;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;


@Component
@FeignClient(value = "CLOUD-PAYMENT-HYSTRIX-SERVICE",fallback = ConsumerServiceImpl.class)
public interface ConsumerService {

    @RequestMapping("/show_OK")
     String show_OK();


    @RequestMapping("/show_timeout")
     String show_timeout();
}
