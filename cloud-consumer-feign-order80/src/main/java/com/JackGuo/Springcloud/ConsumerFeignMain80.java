package com.JackGuo.Springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ConsumerFeignMain80 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeignMain80.class,args);
    }

}
