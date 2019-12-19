package com.diviso.graeshoppe.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.diviso.graeshoppe.client.administration.api.CancellationRequestResourceApi;
import com.diviso.graeshoppe.client.administration.api.CancelledOrderLineResourceApi;
import com.diviso.graeshoppe.client.administration.model.CancellationRequestDTO;
import com.diviso.graeshoppe.client.administration.model.CancelledOrderLineDTO;
import com.diviso.graeshoppe.service.AdministrationCommandService;

@Service
public class AdministrationCommandServiceImpl implements AdministrationCommandService{

	@Autowired
	CancellationRequestResourceApi cancellationRequestResourceApi;
	
	@Autowired
	CancelledOrderLineResourceApi cancelledOrderLineResourceApi;
	
	@Override
	public ResponseEntity<CancellationRequestDTO> createCancellationRequest(CancellationRequestDTO cancellationRequestDTO) {
		
		return cancellationRequestResourceApi.createCancellationRequestUsingPOST(cancellationRequestDTO);
	}

	@Override
	public ResponseEntity<Void> deleteCancellationRequest(Long id) {
		
		return cancellationRequestResourceApi.deleteCancellationRequestUsingDELETE(id);
	}

	@Override
	public ResponseEntity<CancellationRequestDTO> updateCancellationRequest(
			CancellationRequestDTO cancellationRequestDTO) {
		
		return cancellationRequestResourceApi.updateCancellationRequestUsingPUT(cancellationRequestDTO);
	}

	@Override
	public ResponseEntity<CancelledOrderLineDTO> createCancelledOrderLine(CancelledOrderLineDTO cancelledOrderLineDTO) {
		
		return cancelledOrderLineResourceApi.createCancelledOrderLineUsingPOST(cancelledOrderLineDTO);
	}

	@Override
	public ResponseEntity<Void> deleteCancelledOrderLine(Long id) {
		
		return cancelledOrderLineResourceApi.deleteCancelledOrderLineUsingDELETE(id);
	}

	@Override
	public ResponseEntity<CancelledOrderLineDTO> updateCancelledOrderLine(CancelledOrderLineDTO cancelledOrderLineDTO) {
		
		return cancelledOrderLineResourceApi.updateCancelledOrderLineUsingPUT(cancelledOrderLineDTO);
	}

	
}
