package com.JackGuo.Springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class ConsumerFGDashboardMain9001 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerFGDashboardMain9001.class,args);
    }
}
