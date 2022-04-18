package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	@PostMapping
	String createOrder(@RequestBody Order order) {
		System.out.println(order.getItem());
		return "retured";
	}
	
	@GetMapping
	private String getOrder() {
		return "order";
	}
}
