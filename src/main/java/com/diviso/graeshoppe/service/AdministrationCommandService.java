package com.diviso.graeshoppe.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import com.diviso.graeshoppe.client.administration.model.CancellationRequestDTO;
import com.diviso.graeshoppe.client.administration.model.CancelledOrderLineDTO;

public interface AdministrationCommandService {

	public ResponseEntity<CancellationRequestDTO> createCancellationRequest(CancellationRequestDTO cancellationRequestDTO);
	
	/**
    * Delete the "id" cancellationRequest.
    *
    * @param id the id of the entity
    */
    public ResponseEntity<Void> deleteCancellationRequest(Long id);
    
    public ResponseEntity<CancellationRequestDTO> updateCancellationRequest(CancellationRequestDTO cancellationRequestDTO);
    
    public ResponseEntity<CancelledOrderLineDTO> createCancelledOrderLine(CancelledOrderLineDTO cancelledOrderLineDTO);

    /**
     * Delete the "id" cancelledOrderLine.
     *
     * @param id the id of the entity
     */
     public ResponseEntity<Void> deleteCancelledOrderLine(Long id);
     
     public ResponseEntity<CancelledOrderLineDTO> updateCancelledOrderLine(CancelledOrderLineDTO cancelledOrderLineDTO);
}
