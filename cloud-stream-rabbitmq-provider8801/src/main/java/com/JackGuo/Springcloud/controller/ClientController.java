package com.JackGuo.Springcloud.controller;

import com.JackGuo.Springcloud.service.MessageProviderImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Autowired
    private MessageProviderImpl messageProvider;

    @RequestMapping("/send")
    public String send(){
        String msg = messageProvider.send();
        return msg;
    }
}
