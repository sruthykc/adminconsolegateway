package com.diviso.graeshoppe.client.report.model;

import java.util.Objects;
import com.diviso.graeshoppe.client.report.model.OrderMaster;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OfferLine
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-12-23T16:31:30.663813200+05:30[Asia/Calcutta]")

public class OfferLine   {
  @JsonProperty("discountAmount")
  private Double discountAmount = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("offerRef")
  private String offerRef = null;

  @JsonProperty("orderMaster")
  private OrderMaster orderMaster = null;

  public OfferLine discountAmount(Double discountAmount) {
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

  public OfferLine id(Long id) {
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

  public OfferLine offerRef(String offerRef) {
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

  public OfferLine orderMaster(OrderMaster orderMaster) {
    this.orderMaster = orderMaster;
    return this;
  }

  /**
   * Get orderMaster
   * @return orderMaster
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OrderMaster getOrderMaster() {
    return orderMaster;
  }

  public void setOrderMaster(OrderMaster orderMaster) {
    this.orderMaster = orderMaster;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferLine offerLine = (OfferLine) o;
    return Objects.equals(this.discountAmount, offerLine.discountAmount) &&
        Objects.equals(this.id, offerLine.id) &&
        Objects.equals(this.offerRef, offerLine.offerRef) &&
        Objects.equals(this.orderMaster, offerLine.orderMaster);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountAmount, id, offerRef, orderMaster);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferLine {\n");
    
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    offerRef: ").append(toIndentedString(offerRef)).append("\n");
    sb.append("    orderMaster: ").append(toIndentedString(orderMaster)).append("\n");
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

