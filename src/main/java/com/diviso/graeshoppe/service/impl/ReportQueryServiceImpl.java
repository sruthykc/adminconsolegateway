package com.diviso.graeshoppe.service.impl;

import java.time.Instant;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.diviso.graeshoppe.client.report.api.QueryResourceApi;
import com.diviso.graeshoppe.client.report.model.AuxItem;
import com.diviso.graeshoppe.client.report.model.OfferLine;
import com.diviso.graeshoppe.client.report.model.OrderLine;
import com.diviso.graeshoppe.client.report.model.OrderMaster;
import com.diviso.graeshoppe.client.report.model.PageOfOrderMaster;
import com.diviso.graeshoppe.client.report.model.ReportSummary;
import com.diviso.graeshoppe.service.ReportQueryService;
import com.diviso.graeshoppe.web.rest.QueryResource;

@Service
public class ReportQueryServiceImpl implements ReportQueryService {

	@Autowired
	QueryResourceApi queryResourceApi;
	
	private final Logger log = LoggerFactory.getLogger(ReportQueryServiceImpl.class);
	
	@Override
	public ResponseEntity<ReportSummary> createReportSummary(String expectedDelivery, String storeName) {
		
		return queryResourceApi.createReportSummaryUsingGET(expectedDelivery, storeName);
	}


	@Override
	public Long countByExpectedDeliveryAndOrderStatus(String date, String orderStatus) {
		
		log.debug("*************dateee{}",date);
		return queryResourceApi.findOrderCountByDateAndStatusNameUsingGET(date, orderStatus).getBody();
	}

	@Override
	public Long countByOrderStatus(String orderStatus) {
		
		return queryResourceApi.findOrderCountByStatusNameUsingGET(orderStatus).getBody();
	}

	@Override
	public ResponseEntity<byte[]> getReportSummaryAsPdf(String date, String storeId) {
		
		return queryResourceApi.getReportSummaryAsPdfUsingGET(date, storeId);
	}

	@Override
	public ResponseEntity<byte[]> getReportWithAuxAndComboAsPdf(String orderNumber) {
		
		return queryResourceApi.getReportWithAuxAndComboAsPdfUsingGET(orderNumber);
	}

	@Override
	public ResponseEntity<byte[]> getSaleReportAsPdf(String storeidpcode) {
		
		return queryResourceApi.getSaleReportAsPdfUsingGET(storeidpcode);
	}

	@Override
	public ResponseEntity<PageOfOrderMaster> findByExpectedDeliveryBetween(OffsetDateTime from, OffsetDateTime to, Pageable pageable) {
	
		return queryResourceApi.findOrderMasterByExpectedDeliveryBetweenUsingGET(from, to, null, null, null);
	}

	@Override
	public ResponseEntity<PageOfOrderMaster> findByExpectedDeliveryBetweenAndStoreIdpcode(String from, String storeIdpcode, String to, Pageable pageable) {
		/*
		 * Instant fromDate = Instant.parse(from.toString()+"T00:00:00Z"); Instant
		 * toDate = Instant.parse(to.toString()+"T23:59:59Z")
		 */
		log.debug("<<<<<<<<<<<< findByExpectedDeliveryBetweenAndStoreIdpcode >>>>>>>>{}{}",from,to);
		return queryResourceApi.findOrderByDatebetweenAndStoreIdUsingGET(from, storeIdpcode, to, null, null, null);
	}

	@Override
	public ResponseEntity<Long> findOrderMasterCountByExpectedDeliveryBetween(String from, String to) {
		
		return queryResourceApi.findOrderMasterCountByExpectedDeliveryBetweenUsingGET(from, to);
	}

	@Override
	public ResponseEntity<List<OrderLine>> findOrderLinesByOrderNumber(String orderId) {
		log.debug("<<<<<<<<<< findOrderLinesByOrderNumber impl {}",orderId);
		return queryResourceApi.findOrderLineByOrderNumberUsingGET(orderId);
	}

	@Override
	public ResponseEntity<List<OfferLine>> findOfferLinesByOrderNumber(String orderId) {
		log.debug("<<<<<<<<<<findOfferLinesByOrderNumber >>>>>>>{}",orderId );
		return queryResourceApi.findOfferLinesByOrderNumberUsingGET(orderId);
	}

	@Override
	public ResponseEntity<List<AuxItem>> findOfferLinesById(Long id) {
		log.debug("<<<<<<< findOfferLinesById >>>>>",id);
		return queryResourceApi.findAuxItemByidUsingGET(id);
	}
	

	
	

}
