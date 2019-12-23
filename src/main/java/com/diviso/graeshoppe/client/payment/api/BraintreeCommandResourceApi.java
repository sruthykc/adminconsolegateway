/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.diviso.graeshoppe.client.payment.api;

import com.diviso.graeshoppe.client.payment.model.PaymentTransaction;
import com.diviso.graeshoppe.client.payment.model.PaymentTransactionResponse;
import com.diviso.graeshoppe.client.payment.model.RefundResponse;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-12-23T15:54:24.023519800+05:30[Asia/Calcutta]")

@Api(value = "BraintreeCommandResource", description = "the BraintreeCommandResource API")
public interface BraintreeCommandResourceApi {

    @ApiOperation(value = "createClientAuthToken", nickname = "createClientAuthTokenUsingGET", notes = "", response = String.class, tags={ "braintree-command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/clientToken",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<String> createClientAuthTokenUsingGET();


    @ApiOperation(value = "createRefund", nickname = "createRefundUsingPOST", notes = "", response = RefundResponse.class, tags={ "braintree-command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RefundResponse.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/refunds/{transactionId}",
        produces = "*/*", 
        method = RequestMethod.POST)
    ResponseEntity<RefundResponse> createRefundUsingPOST(@ApiParam(value = "transactionId",required=true) @PathVariable("transactionId") String transactionId);


    @ApiOperation(value = "createTransaction", nickname = "createTransactionUsingPOST", notes = "", response = PaymentTransactionResponse.class, tags={ "braintree-command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = PaymentTransactionResponse.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/transaction",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<PaymentTransactionResponse> createTransactionUsingPOST(@ApiParam(value = "paymentTransaction" ,required=true )  @Valid @RequestBody PaymentTransaction paymentTransaction);

}
