package com.diviso.graeshoppe.service.impl;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.diviso.graeshoppe.client.administration.api.CancellationRequestResourceApi;
import com.diviso.graeshoppe.client.administration.api.CancelledOrderLineResourceApi;
import com.diviso.graeshoppe.client.administration.model.CancellationRequestDTO;
import com.diviso.graeshoppe.client.administration.model.CancelledOrderLineDTO;
import com.diviso.graeshoppe.client.administration.model.DataResponse;
import com.diviso.graeshoppe.service.AdministrationQueryService;

@Service
public class AdministrationQueryServiceImpl implements AdministrationQueryService{

	@Autowired
	CancellationRequestResourceApi cancellationRequestResourceApi;
	
	@Autowired
	CancelledOrderLineResourceApi cancelledOrderLineResourceApi;

	@Override
	public ResponseEntity<List<CancellationRequestDTO>> getAllCancellationRequests(Integer page, Integer size, List<String> sort) {
		
		return cancellationRequestResourceApi.getAllCancellationRequestsUsingGET(page, size, sort);
	}

	@Override
	public ResponseEntity<CancellationRequestDTO> findCancellationRequestById(Long id) {
		
		return cancellationRequestResourceApi.getCancellationRequestUsingGET(id);
	}

	@Override
	public ResponseEntity<DataResponse> getTasks(String name, String nameLike, String description, String priority,
			String minimumPriority, String maximumPriority, String assignee, String assigneeLike, String owner,
			String ownerLike, String unassigned, String delegationState, String candidateUser, String candidateGroup,
			String candidateGroups, String involvedUser, String taskDefinitionKey, String taskDefinitionKeyLike,
			String processInstanceId, String processInstanceBusinessKey, String processInstanceBusinessKeyLike,
			@Valid String processDefinitionId, @Valid String processDefinitionKey,
			@Valid String processDefinitionKeyLike, @Valid String processDefinitionName,
			@Valid String processDefinitionNameLike, @Valid String executionId, @Valid String createdOn,
			@Valid String createdBefore, @Valid String createdAfter, @Valid String dueOn, @Valid String dueBefore,
			@Valid String dueAfter, @Valid Boolean withoutDueDate, @Valid Boolean excludeSubTasks,
			@Valid Boolean active, @Valid Boolean includeTaskLocalVariables, @Valid Boolean includeProcessVariables,
			@Valid String tenantId, @Valid String tenantIdLike, @Valid Boolean withoutTenantId,
			@Valid String candidateOrAssigned, @Valid String category) {
		
		return cancellationRequestResourceApi.getTasksUsingGET(active, assignee, assigneeLike, candidateGroup, candidateGroups, candidateOrAssigned, candidateUser, category, createdAfter, createdBefore, createdOn, delegationState, description, dueAfter, dueBefore, dueOn, excludeSubTasks, executionId, includeProcessVariables, includeTaskLocalVariables, involvedUser, maximumPriority, minimumPriority, name, nameLike, owner, ownerLike, maximumPriority, processDefinitionId, processDefinitionKey, processDefinitionKeyLike, processDefinitionName, processDefinitionNameLike, processInstanceBusinessKey, processInstanceBusinessKeyLike, processInstanceId, taskDefinitionKey, taskDefinitionKeyLike, tenantId, tenantIdLike, unassigned, withoutDueDate, withoutTenantId);
	
	}

	@Override
	public ResponseEntity<List<CancellationRequestDTO>> searchCancellationRequests(String query, Integer page, Integer size,
			List<String> sort) {
		
		return cancellationRequestResourceApi.searchCancellationRequestsUsingGET(query, page, size, sort);
	}

	@Override
	public ResponseEntity<List<CancelledOrderLineDTO>> findAllCancelledOrderLines(Integer page, Integer size,
			List<String> sort) {
		
		return cancelledOrderLineResourceApi.getAllCancelledOrderLinesUsingGET(page, size, sort);
	}

	@Override
	public ResponseEntity<CancelledOrderLineDTO> findCancelledOrderLine(Long id) {
		
		return cancelledOrderLineResourceApi.getCancelledOrderLineUsingGET(id);
	}

	@Override
	public ResponseEntity<List<CancelledOrderLineDTO>> searchCancelledOrderLines(String query, Integer page,
			Integer size, List<String> sort) {
		
		return cancelledOrderLineResourceApi.searchCancelledOrderLinesUsingGET(query, page, size, sort);
	}
	
	
}
