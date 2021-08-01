package com.JackGuo.Springcloud.service;

import com.JackGuo.Springcloud.common.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;


@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface ConsumerFeignService {

    @RequestMapping("/show")
    Result show();

    @RequestMapping("/timeOut")
    Result FeignTimeOut();

}
