package com.diviso.graeshoppe.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diviso.graeshoppe.client.administration.model.BannerDTO;
import com.diviso.graeshoppe.client.administration.model.CancellationRequestDTO;
import com.diviso.graeshoppe.client.administration.model.CancelledOrderLineDTO;
import com.diviso.graeshoppe.client.administration.model.NotificationDTO;
import com.diviso.graeshoppe.client.administration.model.RefoundDetailsDTO;
import com.diviso.graeshoppe.client.offer.model.DeductionValueTypeDTO;
import com.diviso.graeshoppe.client.offer.model.OfferModel;
import com.diviso.graeshoppe.client.offer.model.OrderModel;
import com.diviso.graeshoppe.service.AdministrationCommandService;
import com.diviso.graeshoppe.service.OfferCommandService;
import com.diviso.graeshoppe.service.PaymentService;

/**
 * REST controller for managing command service.
 */
@RestController
@RequestMapping("/api/command")
public class CommandResource {

	 private final Logger log = LoggerFactory.getLogger(CommandResource.class);
	 
	 	@Autowired
	 	OfferCommandService offerCommandService;
	 
	 	@Autowired
	 	AdministrationCommandService administrationCommandService;
	 	
	 	@Autowired
	 	PaymentService paymentService;
	 	
	 	/**
	     * POST  /offers/create-offer : Create a new offer.
	     *
	     * @param offerModel the offerModel to create
	     * @return the ResponseEntity with status 201 (Created) and with body the new offerModel, or with status 400 (Bad Request) if the offer has already an ID
	     */
	    @PostMapping("/offers/create-offer")
	    public ResponseEntity<OfferModel> createOffer(@RequestBody OfferModel offerModel){
	        
	        return offerCommandService.saveOffer(offerModel);     
	    }

	    /**
	     * POST  /offers/claimOffer/ : get the "promoCode" and claim the offer.
	     *
	     * @param orderModel the orderModel containing requested offer details
	     * @return the ResponseEntity with status 200 (OK) and with body the OrderModel, or with status 404 (Not Found)
	     */
	    @PostMapping("/offers/claim-offer")
	    public ResponseEntity<OrderModel> claimOffer(@RequestBody OrderModel orderModel){
	       
	        return offerCommandService.claimOffer(orderModel);
	    }
	    
	    /**
	     * POST  /deduction-value-types : Create a new deductionValueType.
	     *
	     * @param deductionValueTypeDTO the deductionValueTypeDTO to create
	     * @return the ResponseEntity with status 201 (Created) and with body the new deductionValueTypeDTO, or with status 400 (Bad Request) if the deductionValueType has already an ID
	     */
	    @PostMapping("/deduction-value-types")
	    public ResponseEntity<DeductionValueTypeDTO> createDeductionValueType(@RequestBody DeductionValueTypeDTO deductionValueTypeDTO) {
	        
	    	return offerCommandService.createDeductionValueType(deductionValueTypeDTO);
	    }

	  
	    /**
	     * POST  /cancellation-requests : Create a new cancellationRequest.
	     *
	     * @param cancellationRequestDTO the cancellationRequestDTO to create
	     * @return the ResponseEntity with status 201 (Created) and with body the new cancellationRequestDTO, or with status 400 (Bad Request) if the cancellationRequest has already an ID
	     */
	    @PostMapping("/cancellation-requests")
	    public ResponseEntity<CancellationRequestDTO> createCancellationRequest(@RequestBody CancellationRequestDTO cancellationRequestDTO) {
	        
	    	return administrationCommandService.createCancellationRequest(cancellationRequestDTO);
	    }
	    
	    /**
	     * DELETE  /cancellation-requests/:id : delete the "id" cancellationRequest.
	     *
	     * @param id the id of the cancellationRequestDTO to delete
	     * @return the ResponseEntity with status 200 (OK)
	     */
	    @DeleteMapping("/cancellation-requests/{id}")
	    public ResponseEntity<Void> deleteCancellationRequest(@PathVariable Long id) {
	        
	        return administrationCommandService.deleteCancellationRequest(id);
	    }
	    
	    /**
	     * PUT  /cancellation-requests : Updates an existing cancellationRequest.
	     *
	     * @param cancellationRequestDTO the cancellationRequestDTO to update
	     * @return the ResponseEntity with status 200 (OK) and with body the updated cancellationRequestDTO,
	     * or with status 400 (Bad Request) if the cancellationRequestDTO is not valid,
	     * or with status 500 (Internal Server Error) if the cancellationRequestDTO couldn't be updated
	     */
	    @PutMapping("/cancellation-requests")
	    public ResponseEntity<CancellationRequestDTO> updateCancellationRequest(@RequestBody CancellationRequestDTO cancellationRequestDTO){
	       
	    	return administrationCommandService.updateCancellationRequest(cancellationRequestDTO);
	    }

	    
	   
	    /**
	     * POST  /cancelled-order-lines : Create a new cancelledOrderLine.
	     *
	     * @param cancelledOrderLineDTO the cancelledOrderLineDTO to create
	     * @return the ResponseEntity with status 201 (Created) and with body the new cancelledOrderLineDTO, or with status 400 (Bad Request) if the cancelledOrderLine has already an ID
	     */
	    @PostMapping("/cancelled-order-lines")
	    public ResponseEntity<CancelledOrderLineDTO> createCancelledOrderLine(@RequestBody CancelledOrderLineDTO cancelledOrderLineDTO){
	       
	    	return administrationCommandService.createCancelledOrderLine(cancelledOrderLineDTO);
	    }
	
	    /**
	     * DELETE  /cancelled-order-lines/:id : delete the "id" cancelledOrderLine.
	     *
	     * @param id the id of the cancelledOrderLineDTO to delete
	     * @return the ResponseEntity with status 200 (OK)
	     */
	    @DeleteMapping("/cancelled-order-lines/{id}")
	    public ResponseEntity<Void> deleteCancelledOrderLine(@PathVariable Long id) {
	        
	        return administrationCommandService.deleteCancelledOrderLine(id);
	    }


	    /**
	     * PUT  /cancelled-order-lines : Updates an existing cancelledOrderLine.
	     *
	     * @param cancelledOrderLineDTO the cancelledOrderLineDTO to update
	     * @return the ResponseEntity with status 200 (OK) and with body the updated cancelledOrderLineDTO,
	     * or with status 400 (Bad Request) if the cancelledOrderLineDTO is not valid,
	     * or with status 500 (Internal Server Error) if the cancelledOrderLineDTO couldn't be updated
	     */
	    @PutMapping("/cancelled-order-lines")
	    public ResponseEntity<CancelledOrderLineDTO> updateCancelledOrderLine(@RequestBody CancelledOrderLineDTO cancelledOrderLineDTO){
	        
	    	return administrationCommandService.updateCancelledOrderLine(cancelledOrderLineDTO);
	    }
	    
	    /**
		  * @author Prince
		  * @swaggerMicrosewrvice administartion
		  * 
		  */
		 @PostMapping("/banners")
		 public ResponseEntity<BannerDTO> createBanner(@RequestBody BannerDTO bannerDTO){
			 log.debug("<<<<<<<< createBanner >>>>>>>",bannerDTO);
			 
			return administrationCommandService.createBanner(bannerDTO); 
		 }
		 @PutMapping("/banners")
		 public ResponseEntity<BannerDTO> updateBanner(@RequestBody BannerDTO bannerDTO){
			 log.debug("<<<<<<<<<<< updateBanner >>>>>>>>",bannerDTO);
			return administrationCommandService.updateBanner(bannerDTO);
			 
		 }
		 @DeleteMapping("/banners/{id}")
		 public ResponseEntity<Void> deleteBanner(@PathVariable Long id){
			 log.debug("<<<<<<<< deleteBanner>>>>>>>",id);
			return administrationCommandService.deleteBanner(id);
			 
		 }
		 @PostMapping("/notifications")
		 public ResponseEntity<NotificationDTO> createNotification(@RequestBody NotificationDTO notificationDTO){
			 log.debug("<<<<<<<<<< createNotification >>>>>>>>>", notificationDTO);
			return administrationCommandService.createNotification(notificationDTO);
		 }
		 @PutMapping("/notifications")
		 public ResponseEntity<NotificationDTO> updateNotification(@RequestBody NotificationDTO notificationDTO){
			 log.debug("<<<<<<<<<< updateNotification >>>>>>>>>>>>>",notificationDTO);
			return administrationCommandService.updateNotification(notificationDTO);
		 }
		 @DeleteMapping("/notifications/{id}")
		 public ResponseEntity<Void> deleteNotification(@PathVariable Long id){
			 log.debug("<<<<<<<<<<< deleteNotification >>>>>>>>>>>",id);
			return administrationCommandService.deleteNotification(id);
			 
		 }
		 @PostMapping("/refund-details/{orderId}")
		 public ResponseEntity<RefoundDetailsDTO> createRefundDetails(@RequestBody RefoundDetailsDTO refoundDetailsDTO,@PathVariable String orderId){
			 log.debug("<<<<<<<<<<< createRefundDetails >>>>>>>>>",refoundDetailsDTO,orderId);
			return administrationCommandService.createRefundDetails(refoundDetailsDTO,orderId);
			 
		 }
		 @PutMapping("/refund-details")
		 public ResponseEntity<RefoundDetailsDTO> updateRefundDetails(@RequestBody RefoundDetailsDTO refundDetailsDTO){
			 log.debug("<<<<<<<<<< updateNotification >>>>>>>>>>>>>",refundDetailsDTO);
			return administrationCommandService.updateRefundDetails(refundDetailsDTO);
		 }
		 @DeleteMapping("/refund-details/{id}")
		 public ResponseEntity<Void> deleteRefundDetails(@PathVariable Long id){
			 log.debug("<<<<<<<<< deleteRefoundDetails >>>>>>>>>>>",id);
			return administrationCommandService.deleteRefundDetails(id);
		 }

		 @PostMapping("/create/refundDetails/{orderId}/{paymentId}")
		   public ResponseEntity<RefoundDetailsDTO> createRefund(@RequestBody RefoundDetailsDTO refundDetailsDTO,@PathVariable String orderId,@PathVariable String paymentId) {
		       log.debug("REST request to save createRefundDetails : {}", refundDetailsDTO+"\n ## orderId = "+orderId+"\n ## paymentId  "+paymentId);
		      
		     return paymentService.createRefund(refundDetailsDTO, orderId, paymentId);
		  
		   }

	    
	    
	    
	    
	    
	    
	    
	    
}
