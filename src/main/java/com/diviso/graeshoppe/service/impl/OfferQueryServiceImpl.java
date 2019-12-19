package com.diviso.graeshoppe.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.diviso.graeshoppe.client.offer.api.AggregateQueryResourceApi;
import com.diviso.graeshoppe.client.offer.model.DeductionValueTypeDTO;
import com.diviso.graeshoppe.client.offer.model.OfferDTO;
import com.diviso.graeshoppe.service.OfferQueryService;

@Service
public class OfferQueryServiceImpl implements OfferQueryService {

	@Autowired
	AggregateQueryResourceApi aggregateQueryResourceApi;
	
	@Override
	public ResponseEntity<List<DeductionValueTypeDTO>> findAllDeductionValueTypes(Pageable pageable) {
	
		return aggregateQueryResourceApi.getAllDeductionValueTypesUsingGET(null, null, null, null, null, null, null, null, null, null);
	}

	@Override
	public ResponseEntity<List<OfferDTO>> findAllOffers(Pageable pageable) {
		
		return aggregateQueryResourceApi.getAllOffersUsingGET(null, null, null, null, null, null, null, null, null, null);
	}

}
