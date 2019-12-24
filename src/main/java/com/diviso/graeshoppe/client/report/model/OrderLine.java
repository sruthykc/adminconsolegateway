package com.diviso.graeshoppe.client.report.model;

import java.util.Objects;
import com.diviso.graeshoppe.client.report.model.AuxItem;
import com.diviso.graeshoppe.client.report.model.ComboItem;
import com.diviso.graeshoppe.client.report.model.OrderMaster;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrderLine
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-12-24T11:33:18.565+05:30[Asia/Calcutta]")

public class OrderLine   {
  @JsonProperty("auxItems")
  @Valid
  private List<AuxItem> auxItems = null;

  @JsonProperty("comboItems")
  @Valid
  private List<ComboItem> comboItems = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("item")
  private String item = null;

  @JsonProperty("orderMaster")
  private OrderMaster orderMaster = null;

  @JsonProperty("quantity")
  private Integer quantity = null;

  @JsonProperty("total")
  private Double total = null;

  public OrderLine auxItems(List<AuxItem> auxItems) {
    this.auxItems = auxItems;
    return this;
  }

  public OrderLine addAuxItemsItem(AuxItem auxItemsItem) {
    if (this.auxItems == null) {
      this.auxItems = new ArrayList<AuxItem>();
    }
    this.auxItems.add(auxItemsItem);
    return this;
  }

  /**
   * Get auxItems
   * @return auxItems
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<AuxItem> getAuxItems() {
    return auxItems;
  }

  public void setAuxItems(List<AuxItem> auxItems) {
    this.auxItems = auxItems;
  }

  public OrderLine comboItems(List<ComboItem> comboItems) {
    this.comboItems = comboItems;
    return this;
  }

  public OrderLine addComboItemsItem(ComboItem comboItemsItem) {
    if (this.comboItems == null) {
      this.comboItems = new ArrayList<ComboItem>();
    }
    this.comboItems.add(comboItemsItem);
    return this;
  }

  /**
   * Get comboItems
   * @return comboItems
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ComboItem> getComboItems() {
    return comboItems;
  }

  public void setComboItems(List<ComboItem> comboItems) {
    this.comboItems = comboItems;
  }

  public OrderLine id(Long id) {
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

  public OrderLine item(String item) {
    this.item = item;
    return this;
  }

  /**
   * Get item
   * @return item
  **/
  @ApiModelProperty(value = "")


  public String getItem() {
    return item;
  }

  public void setItem(String item) {
    this.item = item;
  }

  public OrderLine orderMaster(OrderMaster orderMaster) {
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

  public OrderLine quantity(Integer quantity) {
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

  public OrderLine total(Double total) {
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
    OrderLine orderLine = (OrderLine) o;
    return Objects.equals(this.auxItems, orderLine.auxItems) &&
        Objects.equals(this.comboItems, orderLine.comboItems) &&
        Objects.equals(this.id, orderLine.id) &&
        Objects.equals(this.item, orderLine.item) &&
        Objects.equals(this.orderMaster, orderLine.orderMaster) &&
        Objects.equals(this.quantity, orderLine.quantity) &&
        Objects.equals(this.total, orderLine.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auxItems, comboItems, id, item, orderMaster, quantity, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderLine {\n");
    
    sb.append("    auxItems: ").append(toIndentedString(auxItems)).append("\n");
    sb.append("    comboItems: ").append(toIndentedString(comboItems)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    orderMaster: ").append(toIndentedString(orderMaster)).append("\n");
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

