package com.diviso.graeshoppe.web.rest;

import java.time.Instant;
import java.time.LocalDate;
import java.time.OffsetDateTime;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.diviso.graeshoppe.client.offer.model.DeductionValueTypeDTO;
import com.diviso.graeshoppe.client.offer.model.OfferDTO;
import com.diviso.graeshoppe.client.report.model.OrderMaster;
import com.diviso.graeshoppe.client.report.model.PageOfOrderMaster;
import com.diviso.graeshoppe.client.report.model.ReportSummary;
import com.diviso.graeshoppe.service.OfferQueryService;
/*import com.diviso.graeshoppe.client.administration.api.BannerResourceApi;
import com.diviso.graeshoppe.client.administration.model.Banner;
//import com.diviso.graeshoppe.client.administration.model.BannerDTO;
import com.diviso.graeshoppe.client.offer_resource.api.AggregateQueryResourceApi;
import com.diviso.graeshoppe.client.offer_resource.api.DeductionValueTypeResourceApi;
import com.diviso.graeshoppe.client.offer_resource.model.DeductionValueTypeDTO;
import com.diviso.graeshoppe.client.offer_resource.model.OfferDTO;
import com.diviso.graeshoppe.client.order.model.Order;
import com.diviso.graeshoppe.client.store.domain.Store;*/
//import com.diviso.graeshoppe.client.store.model.Banner;
//import com.diviso.graeshoppe.service.QueryService;
import com.diviso.graeshoppe.service.ReportQueryService;

/**
 * REST controller for managing query service.
 */
@RestController
@RequestMapping("/api/query")
public class QueryResource {
	
	 @Autowired
	 ReportQueryService reportQueryService;
	 
	 @Autowired
	 OfferQueryService offerQueryService;
	
	 private final Logger log = LoggerFactory.getLogger(QueryResource.class);

	 //report apis
	 
	 @GetMapping("/report/{date}/{storeId}")
		public ResponseEntity<ReportSummary> createReportSummary(@PathVariable LocalDate date,@PathVariable String storeId) {
			return reportQueryService.createReportSummary(date,storeId);
		}
	 
	 @GetMapping("/reportview/{expectedDelivery}/{storeName}")
	  public ResponseEntity<ReportSummary> createReportSummary(@PathVariable String expectedDelivery,@PathVariable String storeName) {
	   return reportQueryService.createReportSummary(expectedDelivery,storeName); 
	  }
	 
	 @GetMapping("/findOrderByDatebetweenAndStoreId/{from}/{storeId}/{to}")
		public ResponseEntity<PageOfOrderMaster> findOrderByDatebetweenAndStoreId(@PathVariable OffsetDateTime from,@PathVariable String storeId,@PathVariable OffsetDateTime to,@RequestParam Integer page,@RequestParam Integer size,@RequestParam List<String> sort){
			return reportQueryService.findByExpectedDeliveryBetweenAndStoreIdpcode(from,storeId,to,page,size,sort);
	}
	 
	 @GetMapping("/findOrderCountByDateAndStatusName/{date}/{statusName}")
	    public Long findOrderCountByDateAndStatusName(@PathVariable OffsetDateTime date,@PathVariable String statusName){
	    	return reportQueryService.countByExpectedDeliveryAndOrderStatus(date,statusName);
	  }
	 
	 @GetMapping("/findOrderCountByStatusName/{statusName}")
	    public Long findOrderCountByStatusName(@PathVariable String statusName){
	    	return reportQueryService.countByOrderStatus(statusName);
	  }
	 
	 @GetMapping("/findOrderMasterByExpectedDeliveryBetween/{from}/{to}")
		public ResponseEntity<PageOfOrderMaster> findOrderMasterByExpectedDeliveryBetween(@PathVariable OffsetDateTime from,@PathVariable OffsetDateTime to,@RequestParam Integer page,@RequestParam Integer size,@RequestParam List<String> sort){
			return  reportQueryService.findByExpectedDeliveryBetween(from,to,page,size,sort);
	}
	 
	 
		@GetMapping("/pdf/{orderNumber}")
		public ResponseEntity<byte[]> getReportAsPdf(@PathVariable String orderNumber) {
		       
		       return reportQueryService.getReportAsPdf(orderNumber);
		   }
	 
		 @GetMapping("/reportSummary/{date}/{storeId}")
		 public ResponseEntity<byte[]> getReportSummaryAsPdf(@PathVariable String date,@PathVariable String storeId) {
		       
		       return reportQueryService.getReportSummaryAsPdf(date, storeId);
		   }
		 
		 @GetMapping("/auxcombo/{orderNumber}")
		 public ResponseEntity<byte[]> getReportWithAuxAndComboAsPdf(@PathVariable String orderNumber) {
			       
		       return reportQueryService.getReportWithAuxAndComboAsPdf(orderNumber);
		   }
			
		 @GetMapping("/salereport/{storeidpcode}")
		 public ResponseEntity<byte[]> getSaleReportAsPdf(@PathVariable String storeidpcode) {
			       
		      return reportQueryService.getSaleReportAsPdf(storeidpcode);
		 }
			 
	 //offer apis
		 
		 /**
		     * GET  /deduction-value-types : get all the deductionValueTypes of offers.
		     *
		     * @param pageable the pagination information
		     * @return the ResponseEntity with status 200 (OK) and the list of deductionValueTypes in body
		     */
		 @GetMapping("/offers/get-all-deduction-value-types")
		  public ResponseEntity<List<DeductionValueTypeDTO>> getAllDeductionValueTypes(Pageable pageable) {
		      log.debug("REST request to get a page of DeductionValueTypes");
		      
		      return offerQueryService.findAllDeductionValueTypes(pageable);
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
		       
		        return offerQueryService.findAllOffers(pageable);
		    }
		 
		 
}








