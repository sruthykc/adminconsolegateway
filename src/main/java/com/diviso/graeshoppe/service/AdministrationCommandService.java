package com.diviso.graeshoppe.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import com.diviso.graeshoppe.client.administration.model.BannerDTO;
import com.diviso.graeshoppe.client.administration.model.CancellationRequestDTO;
import com.diviso.graeshoppe.client.administration.model.CancelledOrderLineDTO;
import com.diviso.graeshoppe.client.administration.model.NotificationDTO;
import com.diviso.graeshoppe.client.administration.model.RefoundDetailsDTO;

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
     
     //banner-prince
     

 	ResponseEntity<BannerDTO> createBanner(BannerDTO bannerDTO);

 	ResponseEntity<BannerDTO> updateBanner(BannerDTO bannerDTO);

	ResponseEntity<Void> deleteBanner(Long id);
	
	ResponseEntity<NotificationDTO> createNotification(NotificationDTO notificationDTO);

	ResponseEntity<NotificationDTO> updateNotification(NotificationDTO notificationDTO);

	ResponseEntity<Void> deleteNotification(Long id);

	ResponseEntity<RefoundDetailsDTO> createRefundDetails(RefoundDetailsDTO refundDetailsDTO, String orderId);

	ResponseEntity<RefoundDetailsDTO> updateRefundDetails(RefoundDetailsDTO refundDetailsDTO);

	ResponseEntity<Void> deleteRefundDetails(Long id);

	
}
