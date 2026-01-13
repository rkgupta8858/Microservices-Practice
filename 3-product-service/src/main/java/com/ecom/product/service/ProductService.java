package com.ecom.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.product.entity.Product;
import com.ecom.product.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repository;

	public Product getProduct(int id) {
		return repository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
	}

	public Product saveProduct(Product product) {
		return repository.save(product);
	}
}
