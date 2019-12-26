package com.diviso.graeshoppe.web.rest;

import java.time.Instant;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;

import javax.validation.Valid;

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

import com.diviso.graeshoppe.client.administration.model.BannerDTO;
import com.diviso.graeshoppe.client.administration.model.CancellationRequestDTO;
import com.diviso.graeshoppe.client.administration.model.CancelledOrderLineDTO;
import com.diviso.graeshoppe.client.administration.model.DataResponse;
import com.diviso.graeshoppe.client.administration.model.NotificationDTO;
import com.diviso.graeshoppe.client.administration.model.RefoundDetailsDTO;
import com.diviso.graeshoppe.client.offer.model.DeductionValueTypeDTO;
import com.diviso.graeshoppe.client.offer.model.OfferDTO;
import com.diviso.graeshoppe.client.report.model.AuxItem;
import com.diviso.graeshoppe.client.report.model.OfferLine;
import com.diviso.graeshoppe.client.report.model.OrderLine;
import com.diviso.graeshoppe.client.report.model.OrderMaster;
import com.diviso.graeshoppe.client.report.model.PageOfOrderMaster;
import com.diviso.graeshoppe.client.report.model.ReportSummary;
import com.diviso.graeshoppe.client.store.model.Store;
import com.diviso.graeshoppe.service.AdministrationQueryService;
import com.diviso.graeshoppe.service.OfferQueryService;
import com.diviso.graeshoppe.service.ReportQueryService;

import io.swagger.annotations.ApiParam;

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
	
	 @Autowired
	 AdministrationQueryService administrationQueryService;
	 
	 private final Logger log = LoggerFactory.getLogger(QueryResource.class);

	 
	/*
	 * @GetMapping("/report/{date}/{storeId}") public ResponseEntity<ReportSummary>
	 * createReportSummary(@PathVariable String date,@PathVariable String storeId) {
	 * return reportQueryService.createReportSummary(date,storeId); }
	 */
	 
	 @GetMapping("/reportview/{expectedDelivery}/{storeName}")
	  public ResponseEntity<ReportSummary> createReportSummary(@PathVariable String expectedDelivery,@PathVariable String storeName) {
	   return reportQueryService.createReportSummary(expectedDelivery,storeName); 
	  }
	 
	 @GetMapping("/findOrderByDatebetweenAndStoreId/{from}/{storeId}/{to}")
		public ResponseEntity<PageOfOrderMaster> findOrderByDatebetweenAndStoreId(@PathVariable String from,@PathVariable String storeId,@PathVariable String to,Pageable pageable){
			return reportQueryService.findByExpectedDeliveryBetweenAndStoreIdpcode(from,storeId,to,pageable);
	}
	 
	 @GetMapping("/findOrderCountByDateAndStatusName/{date}/{statusName}")
	    public Long findOrderCountByDateAndStatusName(@PathVariable String date,@PathVariable String statusName){
	    	return reportQueryService.countByExpectedDeliveryAndOrderStatus(date,statusName);
	  }
	 
	 @GetMapping("/findOrderCountByStatusName/{statusName}")
	    public Long findOrderCountByStatusName(@PathVariable String statusName){
	    	return reportQueryService.countByOrderStatus(statusName);
	  }
	 
	 @GetMapping("/findOrderMasterByExpectedDeliveryBetween/{from}/{to}")
		public ResponseEntity<PageOfOrderMaster> findOrderMasterByExpectedDeliveryBetween(@PathVariable OffsetDateTime from,@PathVariable OffsetDateTime to,Pageable pageable){
			return  reportQueryService.findByExpectedDeliveryBetween(from,to,pageable);
	}
	 
	 
	/*
	 * @GetMapping("/pdf/{orderNumber}") public ResponseEntity<byte[]>
	 * getReportAsPdf(@PathVariable String orderNumber) {
	 * 
	 * return reportQueryService.getReportAsPdf(orderNumber); }
	 */
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
			 
	
		 /*
		 * @GetMapping("/findOrderMasterCountByDeliveryBetween/{from}/{to}") public Long
		 * findOrderMasterCountByDeliveryBetween(@PathVariable String from,@PathVariable
		 * String to){ return orderMasterService.countByDeliveryBetween(from,to); }
		 */
		 @GetMapping("/findOrderMasterCountByExpectedDeliveryBetween/{from}/{to}")
		 public ResponseEntity<Long> findOrderMasterCountByExpectedDeliveryBetween(@PathVariable String from,@PathVariable String to){
			
			 return reportQueryService.findOrderMasterCountByExpectedDeliveryBetween(from, to);
		 }
		 
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
		 
		    /**
		     * GET  /query/offers/get-offer-by-id/:id : get the "id" offer.
		     *
		     * @param id the id of the offerDTO to retrieve
		     * @return the ResponseEntity with status 200 (OK) and with body the offerDTO, or with status 404 (Not Found)
		     */
		    @GetMapping("/offers/get-offer-by-id/{id}")
		    public ResponseEntity<OfferDTO> getOfferById(@PathVariable Long id) {
		       
		    	return offerQueryService.findOfferById(id);
		    }
		    
		    /**
		     * Get the "promoCode" of the offer.
		     *
		     * @param promoCode the promoCode of the entity
		     * @return the entity
		     */
		    ResponseEntity<OfferDTO> getOfferByPromoCode(@PathVariable String promoCode){
		    	
		    	return offerQueryService.findOfferByPromoCode(promoCode);
		    }
		    
		   
		    
		    /**
		     * GET  /cancellation-requests : get all the cancellationRequests.
		     *
		     * @param pageable the pagination information
		     * @return the ResponseEntity with status 200 (OK) and the list of cancellationRequests in body
		     */
		    @GetMapping("/cancellation-requests")
		    public ResponseEntity<List<CancellationRequestDTO>> getAllCancellationRequests(Pageable pageable) {
		       
		        return administrationQueryService.getAllCancellationRequests(pageable);
		    }
		    
		    /**
		     * GET  /cancellation-requests/:id : get the "id" cancellationRequest.
		     *
		     * @param id the id of the cancellationRequestDTO to retrieve
		     * @return the ResponseEntity with status 200 (OK) and with body the cancellationRequestDTO, or with status 404 (Not Found)
		     */
		    @GetMapping("/cancellation-requests/{id}")
		    public ResponseEntity<CancellationRequestDTO> getCancellationRequest(@PathVariable Long id) {
		        
		        return administrationQueryService.findCancellationRequestById(id);
		    }
		    
		    @GetMapping("/tasks")
			public ResponseEntity<DataResponse> getTasks(@RequestParam(value = "name", required = false) String name,
					@RequestParam(value = "nameLike", required = false) String nameLike,
					@RequestParam(value = "description", required = false) String description,
					@RequestParam(value = "priority", required = false) String priority,
					@RequestParam(value = "minimumPriority", required = false) String minimumPriority,
					@RequestParam(value = "maximumPriority", required = false) String maximumPriority,
					@RequestParam(value = "assignee", required = false) String assignee,
					@RequestParam(value = "assigneeLike", required = false) String assigneeLike,
					@RequestParam(value = "owner", required = false) String owner,
					@RequestParam(value = "ownerLike", required = false) String ownerLike,
					@RequestParam(value = "unassigned", required = false) String unassigned,
					@RequestParam(value = "delegationState", required = false) String delegationState,
					@RequestParam(value = "candidateUser", required = false) String candidateUser,
					@RequestParam(value = "candidateGroup", required = false) String candidateGroup,
					@RequestParam(value = "candidateGroups", required = false) String candidateGroups,
					@RequestParam(value = "involvedUser", required = false) String involvedUser,
					@RequestParam(value = "taskDefinitionKey", required = false) String taskDefinitionKey,
					@RequestParam(value = "taskDefinitionKeyLike", required = false) String taskDefinitionKeyLike,
					@RequestParam(value = "processInstanceId", required = false) String processInstanceId,
					@RequestParam(value = "processInstanceBusinessKey", required = false) String processInstanceBusinessKey,
					@RequestParam(value = "processInstanceBusinessKeyLike", required = false) String processInstanceBusinessKeyLike,
					@ApiParam(value = "Only return tasks which are part of a process instance which has a process definition with the given id.") @Valid @RequestParam(value = "processDefinitionId", required = false) String processDefinitionId,
					@ApiParam(value = "Only return tasks which are part of a process instance which has a process definition with the given key.") @Valid @RequestParam(value = "processDefinitionKey", required = false) String processDefinitionKey,
					@ApiParam(value = "Only return tasks which are part of a process instance which has a process definition with a key like the given value.") @Valid @RequestParam(value = "processDefinitionKeyLike", required = false) String processDefinitionKeyLike,
					@ApiParam(value = "Only return tasks which are part of a process instance which has a process definition with the given name.") @Valid @RequestParam(value = "processDefinitionName", required = false) String processDefinitionName,
					@ApiParam(value = "Only return tasks which are part of a process instance which has a process definition with a name like the given value.") @Valid @RequestParam(value = "processDefinitionNameLike", required = false) String processDefinitionNameLike,
					@ApiParam(value = "Only return tasks which are part of the execution with the given id.") @Valid @RequestParam(value = "executionId", required = false) String executionId,
					@ApiParam(value = "Only return tasks which are created on the given date.") @Valid @RequestParam(value = "createdOn", required = false) String createdOn,
					@ApiParam(value = "Only return tasks which are created before the given date.") @Valid @RequestParam(value = "createdBefore", required = false) String createdBefore,
					@ApiParam(value = "Only return tasks which are created after the given date.") @Valid @RequestParam(value = "createdAfter", required = false) String createdAfter,
					@ApiParam(value = "Only return tasks which are due on the given date.") @Valid @RequestParam(value = "dueOn", required = false) String dueOn,
					@ApiParam(value = "Only return tasks which are due before the given date.") @Valid @RequestParam(value = "dueBefore", required = false) String dueBefore,
					@ApiParam(value = "Only return tasks which are due after the given date.") @Valid @RequestParam(value = "dueAfter", required = false) String dueAfter,
					@ApiParam(value = "Only return tasks which don�t have a due date. The property is ignored if the value is false.") @Valid @RequestParam(value = "withoutDueDate", required = false) Boolean withoutDueDate,
					@ApiParam(value = "Only return tasks that are not a subtask of another task.") @Valid @RequestParam(value = "excludeSubTasks", required = false) Boolean excludeSubTasks,
					@ApiParam(value = "If true, only return tasks that are not suspended (either part of a process that is not suspended or not part of a process at all). If false, only tasks that are part of suspended process instances are returned.") @Valid @RequestParam(value = "active", required = false) Boolean active,
					@ApiParam(value = "Indication to include task local variables in the result.") @Valid @RequestParam(value = "includeTaskLocalVariables", required = false) Boolean includeTaskLocalVariables,
					@ApiParam(value = "Indication to include process variables in the result.") @Valid @RequestParam(value = "includeProcessVariables", required = false) Boolean includeProcessVariables,
					@ApiParam(value = "Only return tasks with the given tenantId.") @Valid @RequestParam(value = "tenantId", required = false) String tenantId,
					@ApiParam(value = "Only return tasks with a tenantId like the given value.") @Valid @RequestParam(value = "tenantIdLike", required = false) String tenantIdLike,
					@ApiParam(value = "If true, only returns tasks without a tenantId set. If false, the withoutTenantId parameter is ignored.") @Valid @RequestParam(value = "withoutTenantId", required = false) Boolean withoutTenantId,
					@ApiParam(value = "Select tasks that has been claimed or assigned to user or waiting to claim by user (candidate user or groups).") @Valid @RequestParam(value = "candidateOrAssigned", required = false) String candidateOrAssigned,
					@ApiParam(value = "Select tasks with the given category. Note that this is the task category, not the category of the process definition (namespace within the BPMN Xml). ") @Valid @RequestParam(value = "category", required = false) String category) {

				return administrationQueryService.getTasks(name, nameLike, description, priority, minimumPriority, maximumPriority,
						assignee, assigneeLike, owner, ownerLike, unassigned, delegationState, candidateUser, candidateGroup,
						candidateGroups, involvedUser, taskDefinitionKey, taskDefinitionKeyLike, processInstanceId,
						processInstanceBusinessKey, processInstanceBusinessKeyLike, processDefinitionId, processDefinitionKey,
						processDefinitionKeyLike, processDefinitionName, processDefinitionNameLike, executionId, createdOn,
						createdBefore, createdAfter, dueOn, dueBefore, dueAfter, withoutDueDate, excludeSubTasks, active,
						includeTaskLocalVariables, includeProcessVariables, tenantId, tenantIdLike, withoutTenantId,
						candidateOrAssigned, category);
			}
		    
		    
		    /**
		     * SEARCH  /_search/cancellation-requests?query=:query : search for the cancellationRequest corresponding
		     * to the query.
		     *
		     * @param query the query of the cancellationRequest search
		     * @param pageable the pagination information
		     * @return the result of the search
		     */
		    @GetMapping("/_search/cancellation-requests")
		    public ResponseEntity<List<CancellationRequestDTO>> searchCancellationRequests(@RequestParam String query,Pageable pageable) {
		       
		    	return administrationQueryService.searchCancellationRequests(query,pageable);
		    }
		    
		    
		    /**
		     * GET  /cancelled-order-lines : get all the cancelledOrderLines.
		     *
		     * @param pageable the pagination information
		     * @return the ResponseEntity with status 200 (OK) and the list of cancelledOrderLines in body
		     */
		    @GetMapping("/cancelled-order-lines")
		    public ResponseEntity<List<CancelledOrderLineDTO>> getAllCancelledOrderLines(Pageable pageable) {
		        
		    	return administrationQueryService.findAllCancelledOrderLines(pageable);
		    }
		    
		    /**
		     * GET  /cancelled-order-lines/:id : get the "id" cancelledOrderLine.
		     *
		     * @param id the id of the cancelledOrderLineDTO to retrieve
		     * @return the ResponseEntity with status 200 (OK) and with body the cancelledOrderLineDTO, or with status 404 (Not Found)
		     */
		    @GetMapping("/cancelled-order-lines/{id}")
		    public ResponseEntity<CancelledOrderLineDTO> getCancelledOrderLine(@PathVariable Long id) {
		        
		    	return administrationQueryService.findCancelledOrderLine(id);
		    }
		 
		    /**
		     * SEARCH  /_search/cancelled-order-lines?query=:query : search for the cancelledOrderLine corresponding
		     * to the query.
		     *
		     * @param query the query of the cancelledOrderLine search
		     * @param pageable the pagination information
		     * @return the result of the search
		     */
		    @GetMapping("/_search/cancelled-order-lines")
		    public ResponseEntity<List<CancelledOrderLineDTO>> searchCancelledOrderLines(@RequestParam(value = "query", required = true) String query,Pageable pageable) {
		       
		    	return administrationQueryService.searchCancelledOrderLines(query,pageable);
		    }

		    /**
			 * @author Prince
			 * 
			 */
			 @GetMapping("/banners")
			 public ResponseEntity<List<BannerDTO>> getAllBanners(Pageable pageable){
				 log.debug("<<<<<<<<<  getAllBanners >>>>>>>>>>>>");
				return administrationQueryService.findAllBanners(pageable);
				
			 }
			 
			@GetMapping("/banners/{id}")
			public ResponseEntity<BannerDTO> getBanner(@PathVariable Long id){
				log.debug("<<<<<<<< getBanner >>>>>>>",id);
				return administrationQueryService.findBanner(id);
				
			}
			
			@GetMapping("/_search/banners/")
			public ResponseEntity<List<BannerDTO>> searchBanner(@PathVariable String query,Pageable pageable){
				log.debug("<<<<<<< searchBanner >>>>>>>{}",query);
				return administrationQueryService.searchBanners(query,pageable);
			}
			
			
			@GetMapping("/notifications/{id}")
			public ResponseEntity<NotificationDTO> getNotification(@PathVariable Long id){
				log.debug("<<<<<<<<<<< getNotification >>>>>>>>>>",id);
				return administrationQueryService.findNotification(id);
			}
			
			@GetMapping("/notifications")
			public ResponseEntity<List<NotificationDTO>> getAllNotifications(Pageable pageable){
				log.debug("<<<<<<<<< getAllNotifications >>>>>>>>>");
				return administrationQueryService.findAllNotifications(pageable);
				
			}
			
			@GetMapping("/_search/notifications")
			public ResponseEntity<List<NotificationDTO>> searchNotifications(@RequestParam String query,Pageable pageable){
				log.debug("<<<<<<<<<<<  searchNotifications >>>>>>>>>{}",query);
				return administrationQueryService.searchNotifications(query,pageable);
			}
			
			@GetMapping("/refund-details/{id}")
			public ResponseEntity<RefoundDetailsDTO> getRefundDetails(@PathVariable Long id){
				log.debug("<<<<<<<<<<< getRefundDetails >>>>>>>>>>",id);
				return administrationQueryService.findRefundDetails(id);
			}
			
			@GetMapping("/refund-details")
			public ResponseEntity<List<RefoundDetailsDTO>> getAllRefundDetails(Pageable pageable){
				log.debug("<<<<<<<<< getAllRefundDetails >>>>>>>>>");
				return administrationQueryService.findAllRefundDetails(pageable);
				
			}
			
			@GetMapping("/_search/refund-details")
			public ResponseEntity<List<RefoundDetailsDTO>> searchRefundDetails(@RequestParam String query,Pageable pageable){
				log.debug("<<<<<<<<<<<  searchRefundDetails >>>>>>>>>{}",query);
				return administrationQueryService.searchRefundDetails(query,pageable);
			}
			
			@GetMapping("/findStore/{name}")
			public Page<Store> findStoreBySearchTerm(@PathVariable String name, Pageable pageable) {
				return administrationQueryService.findStoreByName(name, pageable);
			}
			@GetMapping("/findOrderLinesByOrderNumber/{orderId}")
			public ResponseEntity<List<OrderLine>> findOrderLinesByOrderNumber(String orderId){
				log.debug("<<<<<<<<<< findOrderLinesByOrderNumber >>>>>>>>>{}",orderId);
				return reportQueryService.findOrderLinesByOrderNumber(orderId);
				
			}
			@GetMapping("/findOfferLinesByOrderNumber/{orderId}")
			public ResponseEntity<List<OfferLine>> findOfferLinesByOrderNumber(String orderId){
				log.debug("<<<<<<<<<< findOfferLinesByOrderNumber >>>>>>>>>{}",orderId);
				return reportQueryService.findOfferLinesByOrderNumber(orderId);
				
			}
			@GetMapping("/findAuxItemsLinesById/{id}")
			public ResponseEntity<List<AuxItem>> findAuxItemsById(Long id){
				log.debug("<<<<<<<<<< findAuxItemsById >>>>>>>>>{}",id);
				return reportQueryService.findOfferLinesById(id);
				
			}
}








