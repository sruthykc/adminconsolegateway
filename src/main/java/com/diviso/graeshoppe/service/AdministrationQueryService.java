package com.diviso.graeshoppe.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;

import com.diviso.graeshoppe.client.administration.model.BannerDTO;
import com.diviso.graeshoppe.client.administration.model.CancellationRequestDTO;
import com.diviso.graeshoppe.client.administration.model.CancelledOrderLineDTO;
import com.diviso.graeshoppe.client.administration.model.DataResponse;
import com.diviso.graeshoppe.client.administration.model.NotificationDTO;
import com.diviso.graeshoppe.client.administration.model.RefoundDetailsDTO;

public interface AdministrationQueryService {

	public ResponseEntity<List<CancellationRequestDTO>> getAllCancellationRequests(Integer page,Integer size,List<String> sort);
	
	/**
     * Get the "id" cancellationRequest.
     *
     * @param id the id of the entity
     * @return the entity
     */
	public ResponseEntity<CancellationRequestDTO> findCancellationRequestById(Long id);
    
	public  ResponseEntity<DataResponse> getTasks(String name, String nameLike, String description, String priority,
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
			@Valid String candidateOrAssigned, @Valid String category);
	
	/**
     * Search for the cancellationRequest corresponding to the query.
     *
     * @param query the query of the search
     * 
     * @param pageable the pagination information
     * @return the list of entities
     */
	public ResponseEntity<List<CancellationRequestDTO>> searchCancellationRequests(String query, Integer page,Integer size,List<String> sort);

	public ResponseEntity<List<CancelledOrderLineDTO>> findAllCancelledOrderLines(Integer page,Integer size,List<String> sort);
	
	/**
     * Get the "id" cancelledOrderLine.
     *
     * @param id the id of the entity
     * @return the entity
     */
    public ResponseEntity<CancelledOrderLineDTO> findCancelledOrderLine(Long id);
    
    public ResponseEntity<List<CancelledOrderLineDTO>> searchCancelledOrderLines(String query,Integer page,Integer size,List<String> sort);

    ResponseEntity<List<BannerDTO>> findAllBanners(Integer page, Integer size, List<String> sort);

    ResponseEntity<List<BannerDTO>> searchBanners(String query, Integer page, Integer size, List<String> sort);

    ResponseEntity<BannerDTO> findBanner(Long id);

    ResponseEntity<List<NotificationDTO>> findAllNotifications(Integer page, Integer size, List<String> sort);

	ResponseEntity<List<NotificationDTO>> searchNotifications(String query, Integer page, Integer size, List<String> sort);

	ResponseEntity<NotificationDTO> findNotification(Long id);

	ResponseEntity<RefoundDetailsDTO> findRefundDetails(Long id);

	ResponseEntity<List<RefoundDetailsDTO>> findAllRefundDetails(Integer page, Integer size, List<String> sort);

	ResponseEntity<List<RefoundDetailsDTO>> searchRefundDetails(String query, Integer page, Integer size,
			List<String> sort);
	
	
    
}
