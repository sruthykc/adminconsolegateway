package com.diviso.graeshoppe.web.rest;

import java.net.URI;
import java.net.URISyntaxException;

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

import com.diviso.graeshoppe.client.administration.api.BannerResourceApi;
import com.diviso.graeshoppe.client.administration.api.CancellationRequestResourceApi;
import com.diviso.graeshoppe.client.administration.api.RefoundDetailsResourceApi;
import com.diviso.graeshoppe.client.administration.model.BannerDTO;
import com.diviso.graeshoppe.client.administration.model.CancellationRequestDTO;
import com.diviso.graeshoppe.client.administration.model.RefoundDetailsDTO;
import com.diviso.graeshoppe.client.offer_resource.api.AggregateCommandResourceApi;
import com.diviso.graeshoppe.client.offer_resource.model.OfferModel;
import com.diviso.graeshoppe.client.payment.api.BraintreeCommandResourceApi;
import com.diviso.graeshoppe.client.payment.api.PaymentResourceApiClient;
import com.diviso.graeshoppe.client.payment.model.RefundResponse;

@RestController
@RequestMapping("/api")
public class CommandResource {
	
	private static final String ENTITY_NAME = "offerApplicationAggregateCommandResource";
	
	private final Logger log = LoggerFactory.getLogger(CommandResource.class);

	@Autowired
	private AggregateCommandResourceApi aggregateCommandResourceApi;
	
	@Autowired
	private BannerResourceApi bannerResourceApi;
	
	@Autowired
	private CancellationRequestResourceApi cancellationRequestApi;
	
	@Autowired
	private RefoundDetailsResourceApi refoundDetailsResourceApi;
	
	
	@Autowired
	private BraintreeCommandResourceApi braintreeCommandResourceApi;
	
	
	 /**
     * POST  /command/offers/create-offer : Create a new offer.
     *
     * @param offerModel the offerModel to create
     * @return the ResponseEntity with status 201 (Created) and with body the new offerModel, or with status 400 (Bad Request) if the offer has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/command/offers/create-offer")
    public ResponseEntity<OfferModel> createOffer(@RequestBody OfferModel offerModel) throws URISyntaxException {
        log.debug("REST request to save Offer : {}", offerModel);
       
        return aggregateCommandResourceApi.createOfferUsingPOST(offerModel);
        
   
    }

    /**
     * POST  /command/Banner/create-Banner : Create a new Banner.
     *
     * @param bannerDtol the offerModel to create
     * @return the ResponseEntity with status 201 (Created) and with body the new bannerModel, or with status 400 (Bad Request) if the banner has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/command/banner/create-banner")
    public ResponseEntity<BannerDTO> createBanner(@RequestBody BannerDTO bannerDto) throws URISyntaxException {
        log.debug("REST request to save banner : {}", bannerDto);
       
        return bannerResourceApi.createBannerUsingPOST(bannerDto);
        
   
    }
    

    /**
     * PUT  /command/Banner/update-Banner : update a Banner.
     *
     * @param bannerDto the banner to update
     * @return the ResponseEntity with status 201 (Updated) and with body the new bannerDto, or with status 400 (Bad Request) if the banner has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PutMapping("/command/banner/update-banner")
    public ResponseEntity<BannerDTO> updateBanner(@RequestBody BannerDTO bannerDTO) throws URISyntaxException {
        log.debug("REST request to Update banner : {}", bannerDTO);
       
        return bannerResourceApi.updateBannerUsingPUT(bannerDTO);
        
   
    }
    
   /**
    * DELETE  /command/Banner/Delete-Banner : Delete a Banner.
    *
    * @param bannerDto the banner to delete
    * @return the ResponseEntity with status (Deleted)or with status 400 (Bad Request) if the banner has already an ID
    * @throws URISyntaxException if the Location URI syntax is incorrect
    */
   @DeleteMapping("/command/banner/update-banner/id")
   public ResponseEntity<Void> deleteBanner(@RequestBody Long id) throws URISyntaxException {
       log.debug("REST request to Delete banner : {}", id);
      
       return bannerResourceApi.deleteBannerUsingDELETE(id);
       
  
   }
   
   
   @PostMapping("/command/create/cancellationRequest")
   public ResponseEntity<CancellationRequestDTO> createCancellationRequest(@RequestBody CancellationRequestDTO cancellationRequestDTO) throws URISyntaxException {
       log.debug("REST request to save cancellationRequest : {}", cancellationRequestDTO);
      
     return  this.cancellationRequestApi.createCancellationRequestUsingPOST(cancellationRequestDTO);
        
  
   }
   
   @PostMapping("/command/create/refundDetails/{orderId}/{paymentId}")
   public ResponseEntity<RefoundDetailsDTO> createRefundDetails(@RequestBody RefoundDetailsDTO refundDetailsDTO,@PathVariable String orderId,@PathVariable String paymentId) throws URISyntaxException {
       log.debug("REST request to save createRefundDetails : {}", refundDetailsDTO+"\n ## orderId = "+orderId+"\n ## paymentId  "+paymentId);
      
      
       /* creating an refund request in payment microservice */
       
      RefundResponse refundResponse = braintreeCommandResourceApi.createRefundUsingPOST(paymentId).getBody();
      
      /* transaction id of refund request is set as refund id in refundDetails */
      
      refundDetailsDTO.setRefundId(refundResponse.getTransactionId());
      
      
     return  this.refoundDetailsResourceApi.createRefoundDetailsUsingPOST(orderId, refundDetailsDTO);
        
  
   }


}
