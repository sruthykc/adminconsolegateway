package com.diviso.graeshoppe.service;

import org.springframework.http.ResponseEntity;

import com.diviso.graeshoppe.client.administration.model.RefoundDetailsDTO;
import com.diviso.graeshoppe.client.payment.model.RefundResponse;

public interface PaymentService {

	ResponseEntity<RefoundDetailsDTO> createRefund(RefoundDetailsDTO refundDetailsDTO,String orderId,String paymentId);
	
	
}
