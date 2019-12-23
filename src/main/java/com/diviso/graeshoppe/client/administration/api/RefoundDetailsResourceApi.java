/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.diviso.graeshoppe.client.administration.api;

import com.diviso.graeshoppe.client.administration.model.RefoundDetailsDTO;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-12-23T13:44:46.699025+05:30[Asia/Calcutta]")

@Api(value = "RefoundDetailsResource", description = "the RefoundDetailsResource API")
public interface RefoundDetailsResourceApi {

    @ApiOperation(value = "createRefoundDetails", nickname = "createRefoundDetailsUsingPOST", notes = "", response = RefoundDetailsDTO.class, tags={ "refound-details-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RefoundDetailsDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/refound-details/{orderId}",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<RefoundDetailsDTO> createRefoundDetailsUsingPOST(@ApiParam(value = "orderId",required=true) @PathVariable("orderId") String orderId,@ApiParam(value = "refoundDetailsDTO" ,required=true )  @Valid @RequestBody RefoundDetailsDTO refoundDetailsDTO);


    @ApiOperation(value = "deleteRefoundDetails", nickname = "deleteRefoundDetailsUsingDELETE", notes = "", tags={ "refound-details-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/refound-details/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteRefoundDetailsUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllRefoundDetails", nickname = "getAllRefoundDetailsUsingGET", notes = "", response = RefoundDetailsDTO.class, responseContainer = "List", tags={ "refound-details-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RefoundDetailsDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/refound-details",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<RefoundDetailsDTO>> getAllRefoundDetailsUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getRefoundDetails", nickname = "getRefoundDetailsUsingGET", notes = "", response = RefoundDetailsDTO.class, tags={ "refound-details-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RefoundDetailsDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/refound-details/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<RefoundDetailsDTO> getRefoundDetailsUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "searchRefoundDetails", nickname = "searchRefoundDetailsUsingGET", notes = "", response = RefoundDetailsDTO.class, responseContainer = "List", tags={ "refound-details-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RefoundDetailsDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/refound-details",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<RefoundDetailsDTO>> searchRefoundDetailsUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "updateRefoundDetails", nickname = "updateRefoundDetailsUsingPUT", notes = "", response = RefoundDetailsDTO.class, tags={ "refound-details-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RefoundDetailsDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/refound-details",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<RefoundDetailsDTO> updateRefoundDetailsUsingPUT(@ApiParam(value = "refoundDetailsDTO" ,required=true )  @Valid @RequestBody RefoundDetailsDTO refoundDetailsDTO);

}
