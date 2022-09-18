package com.codeinsight.orderservice.repository;

import com.codeinsight.orderservice.entity.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends CrudRepository<Order,Long> {

    List<Order> findByName(String name);
}
