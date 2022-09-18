package com.InsightCodeUtkarsh.paymentservice.service;

import com.InsightCodeUtkarsh.paymentservice.dao.PaymentDao;
import com.InsightCodeUtkarsh.paymentservice.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Random;
import java.util.UUID;

@Service
public class PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    public Payment savePayment(@RequestBody Payment payment){
        payment.setTransactionId(UUID.randomUUID().toString());
        payment.setPaymentStatus(paymentStatus());
       return paymentDao.save(payment);
    }

    public String paymentStatus(){
        //third pary api call such as stripe,paytm etc;
        return new Random().nextBoolean()?"success":"false";
    }


}
