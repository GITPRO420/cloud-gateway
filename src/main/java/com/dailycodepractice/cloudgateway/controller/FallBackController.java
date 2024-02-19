package com.dailycodepractice.cloudgateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.ws.rs.PUT;

@RestController
public class FallBackController {

	@PostMapping("/orderservicefallback")
	public String orderServiceFallback() {
		return "ORDER-SERVICE is DOWN !!!";
	}

	@PutMapping("/productservicefallback")
	public String productServiceFallback() {
		return "PRODUCT-SERVICE is DOWN !!!";
	}

	@GetMapping("/paymentservicefallback")
	public String paymentServiceFallback() {
		return "PAYMENT-SERVICE is DOWN !!!";
	}
}
