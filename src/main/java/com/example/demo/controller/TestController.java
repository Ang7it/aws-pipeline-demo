package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Order;
import com.example.demo.service.TestService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class TestController {

	private final TestService testService;
	
	@GetMapping("/{id}")
	public Order getorderById(@PathVariable(name = "id") Long id) {
		return testService.getOrderById(id);
	}
	
	@GetMapping("/")
	public List<Order> getAllOrders(){
		return testService.getAllOrders();
	}
}
