package com.diviso.graeshoppe.web.rest;

import java.time.Instant;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diviso.graeshoppe.client.administration.api.BannerResourceApi;
import com.diviso.graeshoppe.client.administration.model.Banner;
//import com.diviso.graeshoppe.client.administration.model.BannerDTO;
import com.diviso.graeshoppe.client.offer_resource.api.AggregateQueryResourceApi;
import com.diviso.graeshoppe.client.offer_resource.api.DeductionValueTypeResourceApi;
import com.diviso.graeshoppe.client.offer_resource.model.DeductionValueTypeDTO;
import com.diviso.graeshoppe.client.offer_resource.model.OfferDTO;
import com.diviso.graeshoppe.client.order.model.Order;
import com.diviso.graeshoppe.client.store.domain.Store;
//import com.diviso.graeshoppe.client.store.model.Banner;
import com.diviso.graeshoppe.service.QueryService;

/**
 * REST controller for managing Offer query service.
 */
@RestController
@RequestMapping("/api/query")
public class QueryResource {

	
	 private final Logger log = LoggerFactory.getLogger(QueryResource.class);

	 @Autowired
	 private AggregateQueryResourceApi aggregateQueryResourceApi;
	 
	 @Autowired
	 private QueryService queryService;
	 
	 @Autowired
	 private BannerResourceApi bannerResourceApi;
	 	 
	 
	 
	 //************* Store Related End Points***********************
	 
	 
	 @GetMapping("/findStore/{name}")
		public Page<Store> findStoreBySearchTerm(@PathVariable String name, Pageable pageable) {
			return queryService.findStoreBySearchTerm(name, pageable);
		}
	 //getAllBanners change to getAllPremiumBanners

		/**
	     * GET  /all banners : get all the banners
	     *
	     * @param pageable the pagination information
	     * @return the ResponseEntity with status 200 (OK) and the list of banners in body
	     */
	    @GetMapping("/banners/get-all-banners")
	    public ResponseEntity<Page<Banner>> getAllBanners(Pageable pageable) {
	        log.debug("REST request to get a page of DeductionValueTypes");
	        Page<Banner> page = queryService.getAllPremiumBanners(pageable);
	        return ResponseEntity.ok().body(page);
	       
	    }
	 
	 
	 
	 
	 
	 
	 //**************************Offer Related End Points
	 
	 
	 
	 /**
	     * GET  /deduction-value-types : get all the deductionValueTypes of offers.
	     *
	     * @param pageable the pagination information
	     * @return the ResponseEntity with status 200 (OK) and the list of deductionValueTypes in body
	     */
	    @GetMapping("/offers/get-all-deduction-value-types")
	    public ResponseEntity<List<DeductionValueTypeDTO>> getAllDeductionValueTypes(Pageable pageable) {
	        log.debug("REST request to get a page of DeductionValueTypes");
	        List<DeductionValueTypeDTO> deductionValueList = aggregateQueryResourceApi.getAllDeductionValueTypesUsingGET(null, null, null, null, null, null, null, null, null, null).getBody();
	        		
	        return ResponseEntity.ok().body(deductionValueList);
	    }
	    
	    /**
	     * GET  /offers : get all the offers.
	     *
	     * @param pageable the pagination information
	     * @return the ResponseEntity with status 200 (OK) and the list of offers in body
	     */
	    @GetMapping("/offers/get-all-offers")
	    public ResponseEntity<List<OfferDTO>> getAllOffers(Pageable pageable) {
	        log.debug("REST request to get a page of Offers");
	        List<OfferDTO> offerList = aggregateQueryResourceApi.getAllOffersUsingGET(null, null, null, null, null, null, null, null, null, null).getBody(); 
	       
	        return ResponseEntity.ok().body(offerList);
	    }
	    
	    //replaced
	    @GetMapping("/order/{from}/{to}/{storeId}")
		public Page<Order> findOrderByDatebetweenAndStoreId(@PathVariable Instant from,@PathVariable Instant to,@PathVariable String storeId){
			return aggregateQueryService.findOrderByDatebetweenAndStoreId(from,to,storeId);
		}
	      //replaced 
	    @GetMapping("/orderby-date-status-name/{statusName}/{date}")
	    public Long findOrderCountByDateAndStatusName(@PathVariable String statusName,@PathVariable Instant date){
	    	return aggregateQueryService.findOrderCountByDateAndStatusName(statusName,date);
	    }
	      //replaced
	    @GetMapping("/orderby-status/{statusName}")
	    public Long findOrderCountByStatusName(@PathVariable String statusName){
	    	return aggregateQueryService.findOrderCountByStatusName(statusName);
	    }
	    
		
		  //replaced
	    @GetMapping("/order/{from}/{to}")
		public Page<Order> findOrderByDatebetween(@PathVariable Instant from,@PathVariable Instant to){
			return aggregateQueryService.findOrderByDatebetween(from,to);
		}

       //.................alteranate of findOrderCountByDateAndStatusName.........
		@GetMapping("/getorderby-date-status-name/{statusName}/{date}")
		public Long getOrderCountByDateAndStatusName(@PathVariable String statusName, @PathVariable Instant date) {
			log.info(".............."+statusName+".............."+date);
			return aggregateQueryService.getOrderCountByDateAndStatusName(statusName, date);
		}
		
		
	    

}
