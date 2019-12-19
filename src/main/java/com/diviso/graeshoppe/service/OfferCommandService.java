package com.diviso.graeshoppe.service;

import org.springframework.http.ResponseEntity;

import com.diviso.graeshoppe.client.offer.model.OfferModel;
import com.diviso.graeshoppe.client.offer.model.OrderModel;

public interface OfferCommandService {

	public ResponseEntity<OfferModel> saveOffer(OfferModel offerModel);
	
    public ResponseEntity<OrderModel> claimOffer(OrderModel orderModel);
	
}
