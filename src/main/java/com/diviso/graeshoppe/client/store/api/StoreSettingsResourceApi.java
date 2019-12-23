/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.diviso.graeshoppe.client.store.api;

import com.diviso.graeshoppe.client.store.model.StoreSettingsDTO;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-12-23T15:54:12.513299100+05:30[Asia/Calcutta]")

@Api(value = "StoreSettingsResource", description = "the StoreSettingsResource API")
public interface StoreSettingsResourceApi {

    @ApiOperation(value = "createStoreSettings", nickname = "createStoreSettingsUsingPOST", notes = "", response = StoreSettingsDTO.class, tags={ "store-settings-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = StoreSettingsDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/store-settings",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<StoreSettingsDTO> createStoreSettingsUsingPOST(@ApiParam(value = "storeSettingsDTO" ,required=true )  @Valid @RequestBody StoreSettingsDTO storeSettingsDTO);


    @ApiOperation(value = "deleteStoreSettings", nickname = "deleteStoreSettingsUsingDELETE", notes = "", tags={ "store-settings-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/store-settings/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteStoreSettingsUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllStoreSettings", nickname = "getAllStoreSettingsUsingGET", notes = "", response = StoreSettingsDTO.class, responseContainer = "List", tags={ "store-settings-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = StoreSettingsDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/store-settings",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<StoreSettingsDTO>> getAllStoreSettingsUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getStoreSettings", nickname = "getStoreSettingsUsingGET", notes = "", response = StoreSettingsDTO.class, tags={ "store-settings-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = StoreSettingsDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/store-settings/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<StoreSettingsDTO> getStoreSettingsUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "searchStoreSettings", nickname = "searchStoreSettingsUsingGET", notes = "", response = StoreSettingsDTO.class, responseContainer = "List", tags={ "store-settings-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = StoreSettingsDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/store-settings",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<StoreSettingsDTO>> searchStoreSettingsUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "updateStoreSettings", nickname = "updateStoreSettingsUsingPUT", notes = "", response = StoreSettingsDTO.class, tags={ "store-settings-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = StoreSettingsDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/store-settings",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<StoreSettingsDTO> updateStoreSettingsUsingPUT(@ApiParam(value = "storeSettingsDTO" ,required=true )  @Valid @RequestBody StoreSettingsDTO storeSettingsDTO);

}
