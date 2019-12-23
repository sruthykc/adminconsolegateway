/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.diviso.graeshoppe.client.store.api;

import com.diviso.graeshoppe.client.store.model.UserRatingReviewDTO;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-12-23T16:31:48.949027900+05:30[Asia/Calcutta]")

@Api(value = "UserRatingReviewResource", description = "the UserRatingReviewResource API")
public interface UserRatingReviewResourceApi {

    @ApiOperation(value = "createUserRatingReview", nickname = "createUserRatingReviewUsingPOST", notes = "", response = UserRatingReviewDTO.class, tags={ "user-rating-review-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UserRatingReviewDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/user-rating-reviews",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<UserRatingReviewDTO> createUserRatingReviewUsingPOST(@ApiParam(value = "userRatingReviewDTO" ,required=true )  @Valid @RequestBody UserRatingReviewDTO userRatingReviewDTO);


    @ApiOperation(value = "deleteUserRatingReview", nickname = "deleteUserRatingReviewUsingDELETE", notes = "", tags={ "user-rating-review-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/user-rating-reviews/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteUserRatingReviewUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllUserRatingReviews", nickname = "getAllUserRatingReviewsUsingGET", notes = "", response = UserRatingReviewDTO.class, responseContainer = "List", tags={ "user-rating-review-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UserRatingReviewDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/user-rating-reviews",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<UserRatingReviewDTO>> getAllUserRatingReviewsUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getUserRatingReview", nickname = "getUserRatingReviewUsingGET", notes = "", response = UserRatingReviewDTO.class, tags={ "user-rating-review-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UserRatingReviewDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/user-rating-reviews/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<UserRatingReviewDTO> getUserRatingReviewUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "searchUserRatingReviews", nickname = "searchUserRatingReviewsUsingGET", notes = "", response = UserRatingReviewDTO.class, responseContainer = "List", tags={ "user-rating-review-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UserRatingReviewDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/user-rating-reviews",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<UserRatingReviewDTO>> searchUserRatingReviewsUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "updateUserRatingReview", nickname = "updateUserRatingReviewUsingPUT", notes = "", response = UserRatingReviewDTO.class, tags={ "user-rating-review-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UserRatingReviewDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/user-rating-reviews",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<UserRatingReviewDTO> updateUserRatingReviewUsingPUT(@ApiParam(value = "userRatingReviewDTO" ,required=true )  @Valid @RequestBody UserRatingReviewDTO userRatingReviewDTO);

}
