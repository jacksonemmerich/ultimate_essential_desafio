package com.jacksonemmerich.desafio01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jacksonemmerich.desafio01.entities.Order;

@Service
public class OrderService {
	
	private static final double DISCOUNT_PERCENTAGE = 0.01;
	
	@Autowired
	private ShipmentService shipmentService;
	
	public double total(Order order) {
		return getTotalValue(order);
	}
	
	private double getDiscountedValue(Order order) {
		double orderValue = order.getBasic();
		double discount = orderValue * (order.getDiscount() * DISCOUNT_PERCENTAGE);
		return orderValue - discount;
	}
	
	private double getTotalValue(Order order) {
		return getDiscountedValue(order) + shipmentService.calculateShipment(order);
	}
	
}
