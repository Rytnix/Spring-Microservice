package com.codeinsight.orderservice.controller;

import com.codeinsight.orderservice.common.TransactionRequest;
import com.codeinsight.orderservice.common.TransactionResponse;
import com.codeinsight.orderservice.entity.Order;
import com.codeinsight.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/bookorder")
    public TransactionResponse bookOrder(@RequestBody TransactionRequest request){
        return orderService.saveOrder(request);

    }
}
