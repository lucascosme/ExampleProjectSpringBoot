package com.example.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Order;
import com.example.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired OrderRepository orderRepository;

	public void save(){
		Order order = new Order();
		order.setInvoice(UUID.randomUUID().toString());
		order.setNumber(UUID.randomUUID().toString());
		orderRepository.save(order);
	}
}
