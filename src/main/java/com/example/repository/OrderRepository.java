package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.domain.Order;

public interface OrderRepository extends CrudRepository<Order, Long>{

	Order findByNumber(String number);
}
