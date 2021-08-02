package com.JackGuo.Springcloud.MyRule;


import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.loadbalancer.core.RandomLoadBalancer;
import org.springframework.cloud.loadbalancer.core.ReactorLoadBalancer;
import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import org.springframework.cloud.loadbalancer.support.LoadBalancerClientFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;


public class LoadBalancerRule {

    @Bean
    ReactorLoadBalancer<ServiceInstance> RandomLoadBalance(Environment environment, LoadBalancerClientFactory loadBalancer){

        String name = environment.getProperty(loadBalancer.PROPERTY_NAME);
        return new RandomLoadBalancer(loadBalancer.getLazyProvider(name, ServiceInstanceListSupplier.class),
                name);

    }
}
