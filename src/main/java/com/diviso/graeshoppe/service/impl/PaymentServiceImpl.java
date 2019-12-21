package com.diviso.graeshoppe.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.diviso.graeshoppe.client.administration.api.RefoundDetailsResourceApi;
import com.diviso.graeshoppe.client.administration.model.RefoundDetailsDTO;
import com.diviso.graeshoppe.client.payment.api.BraintreeCommandResourceApi;
import com.diviso.graeshoppe.client.payment.model.RefundResponse;
import com.diviso.graeshoppe.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {

	 private final Logger log = LoggerFactory.getLogger(PaymentServiceImpl.class);
	 
	 @Autowired
	 private BraintreeCommandResourceApi braintreeCommandResourceApi;
		
	 @Autowired
	 private RefoundDetailsResourceApi refundDetailsResourceApi;
		
	 
	@Override
	public ResponseEntity<RefoundDetailsDTO> createRefund(RefoundDetailsDTO refundDetailsDTO, String orderId,String paymentId) {
		
		log.debug("REST request to save createRefundDetails : {}", refundDetailsDTO+"\n ## orderId = "+orderId+"\n ## paymentId  "+paymentId);
	      
	       /* creating an refund request in payment microservice */
	       
	      RefundResponse refundResponse = braintreeCommandResourceApi.createRefundUsingPOST(paymentId).getBody();
	      
	      /* transaction id of refund request is set as refund id in refundDetails */
	      
	      refundDetailsDTO.setRefundId(refundResponse.getTransactionId());
	      
	     return  refundDetailsResourceApi.createRefoundDetailsUsingPOST(orderId, refundDetailsDTO);
	        
	}

}
