package com.ecom.payment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.payment.entity.Payment;
import com.ecom.payment.repository.PaymentRepository;
import com.ecom.payment.request.PaymentRequest;

@Service
public class PaymentService {

	@Autowired
	PaymentRepository repository;

	public Payment doPayment(PaymentRequest request) {
		Payment payment = new Payment();
		payment.setOrderId(request.getOrderId());
		payment.setAmount(request.getAmount());
		payment.setStatus(request.getStatus());

		return repository.save(payment);
	}
}
