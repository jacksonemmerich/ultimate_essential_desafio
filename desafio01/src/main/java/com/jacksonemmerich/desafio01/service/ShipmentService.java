package com.jacksonemmerich.desafio01.service;

import org.springframework.stereotype.Service;

import com.jacksonemmerich.desafio01.entities.Order;

@Service
public class ShipmentService {

	private static final double SHIPMENT_FEE_20 = 20.0;
	private static final double SHIPMENT_FEE_12 = 12.0;

	public double calculateShipment(Order order) {
		double orderValue = order.getBasic();
		double total = orderValue;

		total = (orderValue < 100.0) ? SHIPMENT_FEE_20 : (orderValue < 200.0) ? SHIPMENT_FEE_12 : 0.0;

		return total;
	}

}
