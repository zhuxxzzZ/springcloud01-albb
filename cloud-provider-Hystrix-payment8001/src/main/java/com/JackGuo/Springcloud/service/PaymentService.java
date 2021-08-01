package com.JackGuo.Springcloud.service;


import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class PaymentService {

    public String show_OK() {
        return "8001" + "成功";
    }


//    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000")
//    })
    public String show_timeout() {

        int time = 5;
        try {
            TimeUnit.SECONDS.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "8001" + "延时成功，time（秒）：" + time;
    }

    public String paymentInfo_TimeOutHandler(){
        return "生产者降级兜底方法。等待时间过长，已经降级";
    }


//    ------------------------------服务熔断 Circuit breaker断路器

    @HystrixCommand(fallbackMethod = "CircuitBreakerMethod",commandProperties = {
    @HystrixProperty(name = "circuitBreaker.enabled",value = "true") ,//开启断路器
    @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "5"),//请求次数
    @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value= "10000"),//时间窗口期
    @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value="10")//失败率达到多少跳闸
    })
    public String CircuitBreaker(int id){
        if(id<0){
            throw  new RuntimeException("服务降级，id为负数");
        }
            String s= IdUtil.simpleUUID();
            return "哈哈哈，服务成功调用成功+流水号="+s;

    }

    public String CircuitBreakerMethod(int id){
        return "服务熔断，开始降级"+id;
    }
}
