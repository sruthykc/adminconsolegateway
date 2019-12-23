/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.diviso.graeshoppe.client.administration.api;

import com.diviso.graeshoppe.client.administration.model.CancelledOrderLineDTO;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-12-23T15:54:07.058886400+05:30[Asia/Calcutta]")

@Api(value = "CancelledOrderLineResource", description = "the CancelledOrderLineResource API")
public interface CancelledOrderLineResourceApi {

    @ApiOperation(value = "createCancelledOrderLine", nickname = "createCancelledOrderLineUsingPOST", notes = "", response = CancelledOrderLineDTO.class, tags={ "cancelled-order-line-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CancelledOrderLineDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/cancelled-order-lines",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<CancelledOrderLineDTO> createCancelledOrderLineUsingPOST(@ApiParam(value = "cancelledOrderLineDTO" ,required=true )  @Valid @RequestBody CancelledOrderLineDTO cancelledOrderLineDTO);


    @ApiOperation(value = "deleteCancelledOrderLine", nickname = "deleteCancelledOrderLineUsingDELETE", notes = "", tags={ "cancelled-order-line-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/cancelled-order-lines/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteCancelledOrderLineUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllCancelledOrderLines", nickname = "getAllCancelledOrderLinesUsingGET", notes = "", response = CancelledOrderLineDTO.class, responseContainer = "List", tags={ "cancelled-order-line-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CancelledOrderLineDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/cancelled-order-lines",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<CancelledOrderLineDTO>> getAllCancelledOrderLinesUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getCancelledOrderLine", nickname = "getCancelledOrderLineUsingGET", notes = "", response = CancelledOrderLineDTO.class, tags={ "cancelled-order-line-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CancelledOrderLineDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/cancelled-order-lines/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<CancelledOrderLineDTO> getCancelledOrderLineUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "searchCancelledOrderLines", nickname = "searchCancelledOrderLinesUsingGET", notes = "", response = CancelledOrderLineDTO.class, responseContainer = "List", tags={ "cancelled-order-line-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CancelledOrderLineDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/cancelled-order-lines",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<CancelledOrderLineDTO>> searchCancelledOrderLinesUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "updateCancelledOrderLine", nickname = "updateCancelledOrderLineUsingPUT", notes = "", response = CancelledOrderLineDTO.class, tags={ "cancelled-order-line-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CancelledOrderLineDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/cancelled-order-lines",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<CancelledOrderLineDTO> updateCancelledOrderLineUsingPUT(@ApiParam(value = "cancelledOrderLineDTO" ,required=true )  @Valid @RequestBody CancelledOrderLineDTO cancelledOrderLineDTO);

}
