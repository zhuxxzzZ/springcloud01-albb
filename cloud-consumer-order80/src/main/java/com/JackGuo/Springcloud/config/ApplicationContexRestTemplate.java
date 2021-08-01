package com.JackGuo.Springcloud.config;


import com.JackGuo.MyRule.LoadBalancerRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
@LoadBalancerClients(defaultConfiguration = LoadBalancerRule.class)
//@RibbonClient(name = "http://CLOUD-PAYMENT-SERVICE",configuration = RibbonRule.class)
public class ApplicationContexRestTemplate {

    @Bean
    @LoadBalanced
    public RestTemplate getTemplate(){
        return new RestTemplate();
    }
}
