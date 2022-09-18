package com.codeinsight.orderservice.dao;

import com.codeinsight.orderservice.entity.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Orderdao extends CrudRepository<Order,Long> {
}
