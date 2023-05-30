package com.jacksonemmerich.desafio01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.jacksonemmerich.desafio01.entities.Order;
import com.jacksonemmerich.desafio01.service.OrderService;

@SpringBootApplication
@ComponentScan({"com.jacksonemmerich"})
public class Desafio01Application  implements CommandLineRunner{

	@Autowired
	private OrderService orderService;
	
	public static void main(String[] args) {
		SpringApplication.run(Desafio01Application.class, args);
	}

	
	
	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1309,150.0,0.0);
		System.out.println("Pedido código " + order.getCode());
		System.out.printf("Valor total: R$ %.2f", orderService.total(order));
		
	}

}
