package com.diviso.graeshoppe.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.diviso.graeshoppe.client.administration.api.BannerResourceApi;
import com.diviso.graeshoppe.client.administration.api.CancellationRequestResourceApi;
import com.diviso.graeshoppe.client.administration.api.CancelledOrderLineResourceApi;
import com.diviso.graeshoppe.client.administration.api.NotificationResourceApi;
import com.diviso.graeshoppe.client.administration.api.RefoundDetailsResourceApi;
import com.diviso.graeshoppe.client.administration.model.BannerDTO;
import com.diviso.graeshoppe.client.administration.model.CancellationRequestDTO;
import com.diviso.graeshoppe.client.administration.model.CancelledOrderLineDTO;
import com.diviso.graeshoppe.client.administration.model.NotificationDTO;
import com.diviso.graeshoppe.client.administration.model.RefoundDetailsDTO;
import com.diviso.graeshoppe.service.AdministrationCommandService;

@Service
public class AdministrationCommandServiceImpl implements AdministrationCommandService{
	
	private Logger log = LoggerFactory.getLogger(AdministrationCommandServiceImpl.class);
	

	@Autowired
	CancellationRequestResourceApi cancellationRequestResourceApi;
	
	@Autowired
	CancelledOrderLineResourceApi cancelledOrderLineResourceApi;
	
	@Autowired
	BannerResourceApi bannerResourceApi;
	
	@Autowired
	NotificationResourceApi notificationResourceApi;
	
	@Autowired
	RefoundDetailsResourceApi refundDetailsResourceApi;
	
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

	//banner prince
	
	@Override
	public ResponseEntity<BannerDTO> createBanner(BannerDTO bannerDTO) {
		log.debug("<<<<<<< createBanner >>>>>>>",bannerDTO);
		return bannerResourceApi.createBannerUsingPOST(bannerDTO);
	}

	@Override
	public ResponseEntity<BannerDTO> updateBanner(BannerDTO bannerDTO) {
		log.debug("<<<<<<<<<<< updateBanner >>>>>>>>>",bannerDTO);
		return bannerResourceApi.updateBannerUsingPUT(bannerDTO);
	}
	
	@Override
	public ResponseEntity<Void> deleteBanner(Long id) {
		log.debug("<<<<<<< deleteBanner >>>>>>>",id);
		return bannerResourceApi.deleteBannerUsingDELETE(id);
	}

	
	@Override
	public ResponseEntity<NotificationDTO> createNotification(NotificationDTO notificationDTO) {
		log.debug("<<<<<<< createNotification >>>>>>>>>>>>",notificationDTO);
		return notificationResourceApi.createNotificationUsingPOST(notificationDTO);
	}

	@Override
	public ResponseEntity<NotificationDTO> updateNotification(NotificationDTO notificationDTO) {
		log.debug("<<<<<<<< updateNotification >>>>>>>>>",notificationDTO );
		return notificationResourceApi.updateNotificationUsingPUT(notificationDTO);
	}

	@Override
	public ResponseEntity<Void> deleteNotification(Long id) {
		log.debug("<<<<<<<< deleteNotification >>>>>>>>",id);
		return notificationResourceApi.deleteNotificationUsingDELETE(id);
	}

	@Override
	public ResponseEntity<RefoundDetailsDTO> createRefundDetails(RefoundDetailsDTO refundDetailsDTO, String orderId) {
		log.debug("<<<<<<<<<<<< create RefoundDetails>>>>>>>>>");
		return refundDetailsResourceApi.createRefoundDetailsUsingPOST(orderId, refundDetailsDTO);
	}

	@Override
	public ResponseEntity<RefoundDetailsDTO> updateRefundDetails(RefoundDetailsDTO refundDetailsDTO) {
		log.debug("<<<<<<<<<< updateRefoundDetails >>>>>>>>",refundDetailsDTO);
		return refundDetailsResourceApi.updateRefoundDetailsUsingPUT(refundDetailsDTO);
	}

	@Override
	public ResponseEntity<Void> deleteRefundDetails(Long id) {
		log.debug("<<<<<<<<<<<< deleteRefundDetails >>>>>>>>>>",id);
		return refundDetailsResourceApi.deleteRefoundDetailsUsingDELETE(id);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
