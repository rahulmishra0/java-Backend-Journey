package com.cfs.SpringBootP04.controller;

import com.cfs.SpringBootP04.service.PaymentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cfs")
public class PaymentController {

    @Value("${app.institute.name}")  //use to inject value from application.properties into java field, method and constructor.
    private String instituteName;

    private final PaymentService paymentService;

//    //We have two payment method UPI and Card so off cause Ambiguity to aayega and code fatega
//    //to solve this probable spring provide options like @Qualifier
//    public PaymentController(@Qualifier("upiPaymentService") PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }

    //and another options is to make UPi payment @primary.
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping("/pay")
    public String pay(){

        System.out.println(instituteName);
        return paymentService.pay();
    }
}
