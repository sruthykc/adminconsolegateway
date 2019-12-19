package com.diviso.graeshoppe.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diviso.graeshoppe.client.offer.model.OfferModel;
import com.diviso.graeshoppe.client.offer.model.OrderModel;
import com.diviso.graeshoppe.service.OfferCommandService;

/**
 * REST controller for managing command service.
 */
@RestController
@RequestMapping("/api/command")
public class CommandResource {

	 private final Logger log = LoggerFactory.getLogger(CommandResource.class);
	 
	 	@Autowired
	 	OfferCommandService offerCommandService;
	 
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

}
