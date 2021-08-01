package com.JackGuo.Springcloud.controller;


import com.JackGuo.Springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentControler {


    @Autowired
    private PaymentService paymentService;


    @RequestMapping("/show_OK")
    public String show_OK(){
        String s = paymentService.show_OK();
        return s;
    }

    @RequestMapping("/show_timeout")
    public String show_timeout(){
        String s = paymentService.show_timeout();
        return s;
    }


    @RequestMapping("/circuitbreaker/{id}")
    public String CircuitBreaker(@PathVariable("id") int id){
        return paymentService.CircuitBreaker(id);
    }


}
