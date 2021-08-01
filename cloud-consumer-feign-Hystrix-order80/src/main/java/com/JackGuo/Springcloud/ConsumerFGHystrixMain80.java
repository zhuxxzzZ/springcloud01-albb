package com.JackGuo.Springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
@EnableHystrix
public class ConsumerFGHystrixMain80 {
    public static void main(String[] args) {

        SpringApplication.run(ConsumerFGHystrixMain80.class,args);
    }
}
