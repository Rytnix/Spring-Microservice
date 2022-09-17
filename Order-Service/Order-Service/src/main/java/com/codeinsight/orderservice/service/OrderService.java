package com.codeinsight.orderservice.service;

import com.codeinsight.orderservice.entity.Order;
import com.codeinsight.orderservice.dao.Orderdao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private Orderdao orderepo;


    public Order saveOrder(Order order){
        return orderepo.save(order);
    }
}
