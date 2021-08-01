package com.JackGuo.Springcloud.srvice;


import org.springframework.stereotype.Component;

@Component
public class ConsumerServiceImpl implements ConsumerService{
    @Override
    public String show_OK() {
        return "消费者访问出错，请重试";
    }


    @Override
    public String show_timeout() {
        return "消费者服务调用出错，请重试，超时访问";
    }
}
