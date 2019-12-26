/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.diviso.graeshoppe.client.offer.api;

import com.diviso.graeshoppe.client.offer.model.OfferDTO;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-12-26T12:53:00.265+05:30[Asia/Calcutta]")

@Api(value = "OfferResource", description = "the OfferResource API")
public interface OfferResourceApi {

    @ApiOperation(value = "claimOffer", nickname = "claimOfferUsingPOST1", notes = "", response = String.class, tags={ "offer-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/offers/claimOffer",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<String> claimOfferUsingPOST1(@ApiParam(value = "orderModel" ,required=true )  @Valid @RequestBody OrderModel orderModel);


    @ApiOperation(value = "createOffer", nickname = "createOfferUsingPOST1", notes = "", response = OfferDTO.class, tags={ "offer-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OfferDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/offers",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<OfferDTO> createOfferUsingPOST1(@ApiParam(value = "offerDTO" ,required=true )  @Valid @RequestBody OfferDTO offerDTO);


    @ApiOperation(value = "deleteOffer", nickname = "deleteOfferUsingDELETE", notes = "", tags={ "offer-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/offers/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteOfferUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllOffers", nickname = "getAllOffersUsingGET1", notes = "", response = OfferDTO.class, responseContainer = "List", tags={ "offer-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OfferDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/offers",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<OfferDTO>> getAllOffersUsingGET1(@ApiParam(value = "") @Valid @RequestParam(value = "offset", required = false) Long offset,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "") @Valid @RequestParam(value = "pageNumber", required = false) Integer pageNumber,@ApiParam(value = "") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,@ApiParam(value = "") @Valid @RequestParam(value = "paged", required = false) Boolean paged,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort,@ApiParam(value = "") @Valid @RequestParam(value = "sort.sorted", required = false) Boolean sortSorted,@ApiParam(value = "") @Valid @RequestParam(value = "sort.unsorted", required = false) Boolean sortUnsorted,@ApiParam(value = "") @Valid @RequestParam(value = "unpaged", required = false) Boolean unpaged);


    @ApiOperation(value = "getOfferByPromoCode", nickname = "getOfferByPromoCodeUsingGET", notes = "", response = OfferDTO.class, tags={ "offer-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OfferDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/offers/get-offer-by-promoCode/{promoCode}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<OfferDTO> getOfferByPromoCodeUsingGET(@ApiParam(value = "promoCode",required=true) @PathVariable("promoCode") String promoCode);


    @ApiOperation(value = "getOffer", nickname = "getOfferUsingGET", notes = "", response = OfferDTO.class, tags={ "offer-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OfferDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/offers/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<OfferDTO> getOfferUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "searchOffers", nickname = "searchOffersUsingGET", notes = "", response = OfferDTO.class, responseContainer = "List", tags={ "offer-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OfferDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/offers",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<OfferDTO>> searchOffersUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "") @Valid @RequestParam(value = "offset", required = false) Long offset,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "") @Valid @RequestParam(value = "pageNumber", required = false) Integer pageNumber,@ApiParam(value = "") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,@ApiParam(value = "") @Valid @RequestParam(value = "paged", required = false) Boolean paged,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort,@ApiParam(value = "") @Valid @RequestParam(value = "sort.sorted", required = false) Boolean sortSorted,@ApiParam(value = "") @Valid @RequestParam(value = "sort.unsorted", required = false) Boolean sortUnsorted,@ApiParam(value = "") @Valid @RequestParam(value = "unpaged", required = false) Boolean unpaged);


    @ApiOperation(value = "updateOffer", nickname = "updateOfferUsingPUT", notes = "", response = OfferDTO.class, tags={ "offer-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OfferDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/offers",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<OfferDTO> updateOfferUsingPUT(@ApiParam(value = "offerDTO" ,required=true )  @Valid @RequestBody OfferDTO offerDTO);

}
