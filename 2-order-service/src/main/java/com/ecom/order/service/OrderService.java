package com.ecom.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.order.entity.Order;
import com.ecom.order.repository.OrderRepository;
import com.ecom.order.request.OrderRequest;

@Service
public class OrderService {

	@Autowired
	OrderRepository orderRepository;

	public Order placeOrder(OrderRequest request) {
		Order order = new Order();
		order.setProductName(request.getProductName());
		order.setPrice(request.getPrice());
		order.setStatus(request.getStatus());

		return orderRepository.save(order);
	}

}
