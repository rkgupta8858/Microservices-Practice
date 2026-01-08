package com.ecom.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.order.entity.Order;
import com.ecom.order.request.OrderRequest;
import com.ecom.order.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	OrderService orderService;

	@PostMapping("/orderPlaced")
	public ResponseEntity orderPlace(@RequestBody OrderRequest request) {
		Order placeOrder = orderService.placeOrder(request);

		return ResponseEntity.ok(placeOrder);
	}

}
