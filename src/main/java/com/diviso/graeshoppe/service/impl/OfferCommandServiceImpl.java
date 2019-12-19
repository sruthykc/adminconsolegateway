package com.diviso.graeshoppe.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.diviso.graeshoppe.client.offer.api.AggregateCommandResourceApi;
import com.diviso.graeshoppe.client.offer.model.OfferModel;
import com.diviso.graeshoppe.client.offer.model.OrderModel;
import com.diviso.graeshoppe.service.OfferCommandService;

@Service
public class OfferCommandServiceImpl implements OfferCommandService {

	@Autowired
	AggregateCommandResourceApi aggregateCommandResourceApi;
	
	@Override
	public ResponseEntity<OfferModel> saveOffer(OfferModel offerModel) {
		
		return aggregateCommandResourceApi.createOfferUsingPOST(offerModel);
	}

	@Override
	public ResponseEntity<OrderModel> claimOffer(OrderModel orderModel) {
		
		return aggregateCommandResourceApi.claimOfferUsingPOST(orderModel);
	}

	
}
