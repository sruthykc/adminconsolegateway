package com.diviso.graeshoppe.client.report.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OfferLineDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-12-26T12:52:53.808+05:30[Asia/Calcutta]")

public class OfferLineDTO   {
  @JsonProperty("discountAmount")
  private Double discountAmount = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("offerRef")
  private String offerRef = null;

  @JsonProperty("orderMasterId")
  private Long orderMasterId = null;

  public OfferLineDTO discountAmount(Double discountAmount) {
    this.discountAmount = discountAmount;
    return this;
  }

  /**
   * Get discountAmount
   * @return discountAmount
  **/
  @ApiModelProperty(value = "")


  public Double getDiscountAmount() {
    return discountAmount;
  }

  public void setDiscountAmount(Double discountAmount) {
    this.discountAmount = discountAmount;
  }

  public OfferLineDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public OfferLineDTO offerRef(String offerRef) {
    this.offerRef = offerRef;
    return this;
  }

  /**
   * Get offerRef
   * @return offerRef
  **/
  @ApiModelProperty(value = "")


  public String getOfferRef() {
    return offerRef;
  }

  public void setOfferRef(String offerRef) {
    this.offerRef = offerRef;
  }

  public OfferLineDTO orderMasterId(Long orderMasterId) {
    this.orderMasterId = orderMasterId;
    return this;
  }

  /**
   * Get orderMasterId
   * @return orderMasterId
  **/
  @ApiModelProperty(value = "")


  public Long getOrderMasterId() {
    return orderMasterId;
  }

  public void setOrderMasterId(Long orderMasterId) {
    this.orderMasterId = orderMasterId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferLineDTO offerLineDTO = (OfferLineDTO) o;
    return Objects.equals(this.discountAmount, offerLineDTO.discountAmount) &&
        Objects.equals(this.id, offerLineDTO.id) &&
        Objects.equals(this.offerRef, offerLineDTO.offerRef) &&
        Objects.equals(this.orderMasterId, offerLineDTO.orderMasterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountAmount, id, offerRef, orderMasterId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferLineDTO {\n");
    
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    offerRef: ").append(toIndentedString(offerRef)).append("\n");
    sb.append("    orderMasterId: ").append(toIndentedString(orderMasterId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

