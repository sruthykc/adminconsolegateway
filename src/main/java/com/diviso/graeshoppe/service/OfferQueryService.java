package com.diviso.graeshoppe.service;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import com.diviso.graeshoppe.client.offer.model.DeductionValueTypeDTO;
import com.diviso.graeshoppe.client.offer.model.OfferDTO;

public interface OfferQueryService {
	
	 /**
     * Get all the offer deductionValueTypes.
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
	public ResponseEntity<List<DeductionValueTypeDTO>> findAllDeductionValueTypes(Pageable pageable);
	
	/**
     * Get all the offers.
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
	public ResponseEntity<List<OfferDTO>> findAllOffers(Pageable pageable);
	
	
	/**
     * Get the "id" offer.
     *
     * @param id the id of the entity
     * @return the entity
     */
	ResponseEntity<OfferDTO> findOfferById(Long id);
	
	ResponseEntity<OfferDTO> findOfferByPromoCode(String promoCode);


}
