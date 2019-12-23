/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.diviso.graeshoppe.client.order.api;

import com.diviso.graeshoppe.client.order.model.ApprovalDetailsDTO;
import com.diviso.graeshoppe.client.order.model.CommandResource;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-12-23T13:44:59.779746200+05:30[Asia/Calcutta]")

@Api(value = "ApprovalDetailsResource", description = "the ApprovalDetailsResource API")
public interface ApprovalDetailsResourceApi {

    @ApiOperation(value = "createApprovalDetails", nickname = "createApprovalDetailsUsingPOST", notes = "", response = CommandResource.class, tags={ "approval-details-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CommandResource.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/approval-details/{taskId}",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<CommandResource> createApprovalDetailsUsingPOST(@ApiParam(value = "taskId",required=true) @PathVariable("taskId") String taskId,@ApiParam(value = "approvalDetailsDTO" ,required=true )  @Valid @RequestBody ApprovalDetailsDTO approvalDetailsDTO);


    @ApiOperation(value = "deleteApprovalDetails", nickname = "deleteApprovalDetailsUsingDELETE", notes = "", tags={ "approval-details-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/approval-details/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteApprovalDetailsUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllApprovalDetails", nickname = "getAllApprovalDetailsUsingGET", notes = "", response = ApprovalDetailsDTO.class, responseContainer = "List", tags={ "approval-details-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ApprovalDetailsDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/approval-details",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<ApprovalDetailsDTO>> getAllApprovalDetailsUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getApprovalDetails", nickname = "getApprovalDetailsUsingGET", notes = "", response = ApprovalDetailsDTO.class, tags={ "approval-details-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ApprovalDetailsDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/approval-details/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<ApprovalDetailsDTO> getApprovalDetailsUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "searchApprovalDetails", nickname = "searchApprovalDetailsUsingGET", notes = "", response = ApprovalDetailsDTO.class, responseContainer = "List", tags={ "approval-details-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ApprovalDetailsDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/approval-details",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<ApprovalDetailsDTO>> searchApprovalDetailsUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "updateApprovalDetails", nickname = "updateApprovalDetailsUsingPUT", notes = "", response = ApprovalDetailsDTO.class, tags={ "approval-details-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ApprovalDetailsDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/approval-details",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<ApprovalDetailsDTO> updateApprovalDetailsUsingPUT(@ApiParam(value = "approvalDetailsDTO" ,required=true )  @Valid @RequestBody ApprovalDetailsDTO approvalDetailsDTO);

}
