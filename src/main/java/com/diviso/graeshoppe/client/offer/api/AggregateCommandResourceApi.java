/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.diviso.graeshoppe.client.offer.api;

import com.diviso.graeshoppe.client.offer.model.OfferModel;
import com.diviso.graeshoppe.client.offer.model.OrderModel;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-12-23T13:44:40.551854300+05:30[Asia/Calcutta]")

@Api(value = "AggregateCommandResource", description = "the AggregateCommandResource API")
public interface AggregateCommandResourceApi {

    @ApiOperation(value = "claimOffer", nickname = "claimOfferUsingPOST", notes = "", response = OrderModel.class, tags={ "aggregate-command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OrderModel.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/command/offers/claim-offer",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<OrderModel> claimOfferUsingPOST(@ApiParam(value = "orderModel" ,required=true )  @Valid @RequestBody OrderModel orderModel);


    @ApiOperation(value = "createOffer", nickname = "createOfferUsingPOST", notes = "", response = OfferModel.class, tags={ "aggregate-command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OfferModel.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/command/offers/create-offer",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<OfferModel> createOfferUsingPOST(@ApiParam(value = "offerModel" ,required=true )  @Valid @RequestBody OfferModel offerModel);

}
