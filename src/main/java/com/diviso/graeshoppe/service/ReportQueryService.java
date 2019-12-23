package com.diviso.graeshoppe.service;

import java.time.Instant;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.diviso.graeshoppe.client.report.model.OrderMaster;
import com.diviso.graeshoppe.client.report.model.PageOfOrderMaster;
import com.diviso.graeshoppe.client.report.model.ReportSummary;

public interface ReportQueryService {

	public ResponseEntity<ReportSummary> createReportSummary(LocalDate date,String storeId);
	
	public ResponseEntity<ReportSummary> createReportSummary(String expectedDelivery, String storeName);

	public ResponseEntity<PageOfOrderMaster> findByExpectedDeliveryBetweenAndStoreIdpcode(OffsetDateTime from, String storeIdpcode, OffsetDateTime to, Pageable pageable);
	
	public Long countByExpectedDeliveryAndOrderStatus(String date, String orderStatus);

	public Long countByOrderStatus(String orderStatus);
	
	public ResponseEntity<PageOfOrderMaster> findByExpectedDeliveryBetween(OffsetDateTime from, OffsetDateTime to,Pageable pageable);

	public ResponseEntity<byte[]> getReportAsPdf(String orderNumber);
	
	public ResponseEntity<byte[]> getReportSummaryAsPdf(String date,String storeId);

	/**
	 * @param orderNumber
	 * @return
	 */
	public ResponseEntity<byte[]> getReportWithAuxAndComboAsPdf(String orderNumber);
	
	public ResponseEntity<byte[]> getSaleReportAsPdf(String storeidpcode);
	
	ResponseEntity<Long> findOrderMasterCountByExpectedDeliveryBetween(String from,String to);
}
