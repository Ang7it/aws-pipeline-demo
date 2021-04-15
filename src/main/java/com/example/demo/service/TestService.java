package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.Order;

@Service
public class TestService {

	private static List<Order> orderList=new ArrayList<>();
	
	TestService(){
		orderList.add(new Order(1L, "First Oder", 500.00));
		orderList.add(new Order(2L, "Second Oder", 1000.00));
		orderList.add(new Order(3L, "Third Oder", 800.00));
		orderList.add(new Order(4L, "Fourth Oder", 1500.00));
	}
	
	public Order getOrderById(Long id) {
		return orderList.stream().filter(o-> o.getId().equals(id)).findFirst().get();
	}
	
	public List<Order> getAllOrders(){
		return orderList;
	}
}
