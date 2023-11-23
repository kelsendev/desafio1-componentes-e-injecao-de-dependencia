package com.kelsendev.desafio1;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.kelsendev.desafio1.entities.Order;
import com.kelsendev.desafio1.services.OrderService;


@SpringBootApplication
@ComponentScan({"com.kelsendev"})
public class Desafio1Application implements CommandLineRunner {

	
	@Autowired
	private OrderService orderService;
		
	
	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
			
		Locale.setDefault(Locale.US);

		Order order =  new Order(1309,95.90,0.0);
		System.out.println("Order code : " + order.getCode());
		System.out.printf("Total value: %.2f%n ", orderService.total(order) );
		
	}

}
