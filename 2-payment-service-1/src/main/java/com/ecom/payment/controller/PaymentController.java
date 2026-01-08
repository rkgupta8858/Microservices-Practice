package com.ecom.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.payment.entity.Payment;
import com.ecom.payment.request.PaymentRequest;
import com.ecom.payment.service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {

	@Autowired
	PaymentService service;

	@PostMapping("/doPayment")
	public ResponseEntity doPayment(@RequestBody PaymentRequest request) {
		Payment doPayment = service.doPayment(request);
		return ResponseEntity.ok(doPayment);
	}
}
