package com.diviso.graeshoppe.client.report.model;

import java.util.Objects;
import com.diviso.graeshoppe.client.report.model.OrderLine;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AuxItem
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-12-23T15:53:56.428310200+05:30[Asia/Calcutta]")

public class AuxItem   {
  @JsonProperty("auxItem")
  private String auxItem = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("orderLine")
  private OrderLine orderLine = null;

  @JsonProperty("quantity")
  private Integer quantity = null;

  @JsonProperty("total")
  private Double total = null;

  public AuxItem auxItem(String auxItem) {
    this.auxItem = auxItem;
    return this;
  }

  /**
   * Get auxItem
   * @return auxItem
  **/
  @ApiModelProperty(value = "")


  public String getAuxItem() {
    return auxItem;
  }

  public void setAuxItem(String auxItem) {
    this.auxItem = auxItem;
  }

  public AuxItem id(Long id) {
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

  public AuxItem orderLine(OrderLine orderLine) {
    this.orderLine = orderLine;
    return this;
  }

  /**
   * Get orderLine
   * @return orderLine
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OrderLine getOrderLine() {
    return orderLine;
  }

  public void setOrderLine(OrderLine orderLine) {
    this.orderLine = orderLine;
  }

  public AuxItem quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(value = "")


  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public AuxItem total(Double total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(value = "")


  public Double getTotal() {
    return total;
  }

  public void setTotal(Double total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuxItem auxItem = (AuxItem) o;
    return Objects.equals(this.auxItem, auxItem.auxItem) &&
        Objects.equals(this.id, auxItem.id) &&
        Objects.equals(this.orderLine, auxItem.orderLine) &&
        Objects.equals(this.quantity, auxItem.quantity) &&
        Objects.equals(this.total, auxItem.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auxItem, id, orderLine, quantity, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuxItem {\n");
    
    sb.append("    auxItem: ").append(toIndentedString(auxItem)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orderLine: ").append(toIndentedString(orderLine)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

