package com.InsightCodeUtkarsh.paymentservice.controller;

import com.InsightCodeUtkarsh.paymentservice.entity.Payment;
import com.InsightCodeUtkarsh.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
   private PaymentService paymentService;

    @PostMapping("/savepayment")
    public Payment doPayment(@RequestBody Payment payment){
        return paymentService.savePayment(payment);
    }



}
