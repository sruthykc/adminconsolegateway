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
 * ComboItem
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-12-24T11:33:18.565+05:30[Asia/Calcutta]")

public class ComboItem   {
  @JsonProperty("comboItem")
  private String comboItem = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("orderLine")
  private OrderLine orderLine = null;

  @JsonProperty("quantity")
  private Double quantity = null;

  public ComboItem comboItem(String comboItem) {
    this.comboItem = comboItem;
    return this;
  }

  /**
   * Get comboItem
   * @return comboItem
  **/
  @ApiModelProperty(value = "")


  public String getComboItem() {
    return comboItem;
  }

  public void setComboItem(String comboItem) {
    this.comboItem = comboItem;
  }

  public ComboItem id(Long id) {
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

  public ComboItem orderLine(OrderLine orderLine) {
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

  public ComboItem quantity(Double quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(value = "")


  public Double getQuantity() {
    return quantity;
  }

  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComboItem comboItem = (ComboItem) o;
    return Objects.equals(this.comboItem, comboItem.comboItem) &&
        Objects.equals(this.id, comboItem.id) &&
        Objects.equals(this.orderLine, comboItem.orderLine) &&
        Objects.equals(this.quantity, comboItem.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comboItem, id, orderLine, quantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComboItem {\n");
    
    sb.append("    comboItem: ").append(toIndentedString(comboItem)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orderLine: ").append(toIndentedString(orderLine)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

