package com.cfs.SpringBootP04.service.impl;

import com.cfs.SpringBootP04.service.PaymentService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class UpiPaymentService implements PaymentService {

    public String pay(){
        return "UPI";
    }
}
