package com.ecom.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.order.client.ProductClient;
import com.ecom.order.entity.Order;
import com.ecom.order.repository.OrderRepository;
import com.ecom.order.request.OrderRequest;
import com.ecom.order.response.Product;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;

	@Autowired
	private ProductClient productClient;

	public Order placeOrder(OrderRequest request) {

		int quantity = request.getQuantity();
		Product product = productClient.getProductById(request.getProductId());

		Order order = new Order();
		order.setProductId(product.getId());
		order.setProductName(product.getName());
		order.setQuantity(quantity);
		order.setPrice(quantity * product.getPrice());

		order.setStatus("ORDER_PLACED");

		return repository.save(order);
	}

}
