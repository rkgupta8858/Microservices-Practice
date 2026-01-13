package com.ecom.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.product.entity.Product;
import com.ecom.product.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	
	@Autowired
	private ProductService service;

	@PostMapping
	public Product addProduct(@RequestBody Product product) {
		return service.saveProduct(product);
	}

	@GetMapping("/{id}")
	public Product getProduct(@PathVariable int id) {
		return service.getProduct(id);
	}
}
