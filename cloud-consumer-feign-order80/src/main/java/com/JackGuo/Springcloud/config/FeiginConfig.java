package com.JackGuo.Springcloud.config;


import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeiginConfig {
        @Bean
            //注明将返回值放到spring容器中
        Logger.Level feignLoggerLevel() {
            return Logger.Level.FULL;
        }

    }

