package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired private OrderService orderService;
	
	@PostMapping
	public String save(){
		orderService.save();
		return "Sucesso";
	}

}
