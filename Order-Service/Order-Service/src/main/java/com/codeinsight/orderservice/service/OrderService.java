package com.codeinsight.orderservice.service;

import com.codeinsight.orderservice.common.Payment;
import com.codeinsight.orderservice.common.TransactionRequest;
import com.codeinsight.orderservice.common.TransactionResponse;
import com.codeinsight.orderservice.entity.Order;
import com.codeinsight.orderservice.dao.Orderdao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.sql.rowset.spi.TransactionalWriter;

@Service
public class OrderService {

    private  String message ="";
    @Autowired
    private Orderdao orderepo;

    @Autowired
    private RestTemplate template;

    public TransactionResponse saveOrder(TransactionRequest request){
         Order order = request.getOrder();
        Payment payment = request.getPayment();
        payment.setOrderId(order.getId());
        payment.setAmount(order.getPrice());
        //Rest api call over here.
        Payment paymentresponse = template.postForObject("http://localhost:8081/payment/savepayment",payment,Payment.class);
        if(paymentresponse.getPaymentStatus().equals("success"))
            message = "Payment processing successfull and Order placed!!!";
        else
            message = "There is a failure in payment api, Order added in your cart";
        orderepo.save(order);
        return new TransactionResponse(order, paymentresponse.getTransactionId(), paymentresponse.getAmount(),message);
    }
}
