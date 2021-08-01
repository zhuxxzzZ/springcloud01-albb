package com.JackGuo.Springcloud.config;

import cn.hutool.http.HttpStatus;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Date;

@Configuration
public class GatewayFilter implements GlobalFilter,Ordered {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        System.out.println("*************** 进入全局过滤器: "+new Date() +"******************");
        String username = exchange.getRequest().getQueryParams().getFirst("username");
        if (username ==null){
            System.out.println("非法用户");
            exchange.getResponse().setRawStatusCode(HttpStatus.HTTP_NOT_ACCEPTABLE);
            return exchange.getResponse().setComplete();
        }

        return chain.filter(exchange);
    }


//    加载过滤器的顺序，数字越小，优先级越高，主要是确定优先级的
    @Override
    public int getOrder() {
        return 0;
    }
}
