package com.diviso.graeshoppe.service.impl;

import java.time.Instant;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.diviso.graeshoppe.client.report.api.QueryResourceApi;
import com.diviso.graeshoppe.client.report.model.OrderMaster;
import com.diviso.graeshoppe.client.report.model.PageOfOrderMaster;
import com.diviso.graeshoppe.client.report.model.ReportSummary;
import com.diviso.graeshoppe.service.ReportQueryService;

@Service
public class ReportQueryServiceImpl implements ReportQueryService {

	@Autowired
	QueryResourceApi queryResourceApi;
	
	@Override
	public ResponseEntity<ReportSummary> createReportSummary(LocalDate date, String storeId) {
		
		return queryResourceApi.createReportSummaryUsingGET(date, storeId);
	}

	@Override
	public ResponseEntity<ReportSummary> createReportSummary(String expectedDelivery, String storeName) {
		
		return queryResourceApi.createReportSummaryUsingGET1(expectedDelivery, storeName);
	}

	@Override
	public Long countByExpectedDeliveryAndOrderStatus(OffsetDateTime date, String orderStatus) {
		
		return queryResourceApi.findOrderCountByDateAndStatusNameUsingGET(date, orderStatus).getBody();
	}

	@Override
	public Long countByOrderStatus(String orderStatus) {
		
		return queryResourceApi.findOrderCountByStatusNameUsingGET(orderStatus).getBody();
	}

	@Override
	public ResponseEntity<byte[]> getReportAsPdf(String orderNumber) {
		
		return queryResourceApi.getReportAsPdfUsingGET(orderNumber);
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
	public ResponseEntity<PageOfOrderMaster> findByExpectedDeliveryBetweenAndStoreIdpcode(OffsetDateTime from, String storeIdpcode, OffsetDateTime to, Pageable pageable) {
		
		return queryResourceApi.findOrderByDatebetweenAndStoreIdUsingGET(from, storeIdpcode, to, null, null, null);
	}

	
	

}
