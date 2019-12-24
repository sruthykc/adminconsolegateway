package com.diviso.graeshoppe.client.report.model;

import java.util.Objects;
import com.diviso.graeshoppe.client.report.model.OfferLine;
import com.diviso.graeshoppe.client.report.model.OrderLine;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrderMaster
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-12-24T11:33:18.565+05:30[Asia/Calcutta]")

public class OrderMaster   {
  @JsonProperty("addressType")
  private String addressType = null;

  @JsonProperty("allergyNote")
  private String allergyNote = null;

  @JsonProperty("alternatePhone")
  private Long alternatePhone = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("customerId")
  private String customerId = null;

  @JsonProperty("customerName")
  private String customerName = null;

  @JsonProperty("customerOrder")
  private Long customerOrder = null;

  @JsonProperty("deliveryCharge")
  private Double deliveryCharge = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("expectedDelivery")
  private OffsetDateTime expectedDelivery = null;

  @JsonProperty("houseNoOrBuildingName")
  private String houseNoOrBuildingName = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("landmark")
  private String landmark = null;

  @JsonProperty("methodOfOrder")
  private String methodOfOrder = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("notes")
  private String notes = null;

  @JsonProperty("offerLines")
  @Valid
  private List<OfferLine> offerLines = null;

  @JsonProperty("orderAcceptedAt")
  private OffsetDateTime orderAcceptedAt = null;

  @JsonProperty("orderDiscountAmount")
  private Double orderDiscountAmount = null;

  @JsonProperty("orderFromCustomer")
  private Long orderFromCustomer = null;

  @JsonProperty("orderLines")
  @Valid
  private List<OrderLine> orderLines = null;

  @JsonProperty("orderNumber")
  private String orderNumber = null;

  @JsonProperty("orderPlaceAt")
  private OffsetDateTime orderPlaceAt = null;

  @JsonProperty("orderStatus")
  private String orderStatus = null;

  @JsonProperty("paymentRef")
  private String paymentRef = null;

  @JsonProperty("paymentStatus")
  private String paymentStatus = null;

  @JsonProperty("phone")
  private Long phone = null;

  @JsonProperty("pincode")
  private String pincode = null;

  @JsonProperty("preOrderDate")
  private OffsetDateTime preOrderDate = null;

  @JsonProperty("roadNameAreaOrStreet")
  private String roadNameAreaOrStreet = null;

  @JsonProperty("serviceCharge")
  private Double serviceCharge = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("storeIdpcode")
  private String storeIdpcode = null;

  @JsonProperty("storeName")
  private String storeName = null;

  @JsonProperty("storePhone")
  private Long storePhone = null;

  @JsonProperty("storelocationName")
  private String storelocationName = null;

  @JsonProperty("subTotal")
  private Double subTotal = null;

  @JsonProperty("totalDue")
  private Double totalDue = null;

  public OrderMaster addressType(String addressType) {
    this.addressType = addressType;
    return this;
  }

  /**
   * Get addressType
   * @return addressType
  **/
  @ApiModelProperty(value = "")


  public String getAddressType() {
    return addressType;
  }

  public void setAddressType(String addressType) {
    this.addressType = addressType;
  }

  public OrderMaster allergyNote(String allergyNote) {
    this.allergyNote = allergyNote;
    return this;
  }

  /**
   * Get allergyNote
   * @return allergyNote
  **/
  @ApiModelProperty(value = "")


  public String getAllergyNote() {
    return allergyNote;
  }

  public void setAllergyNote(String allergyNote) {
    this.allergyNote = allergyNote;
  }

  public OrderMaster alternatePhone(Long alternatePhone) {
    this.alternatePhone = alternatePhone;
    return this;
  }

  /**
   * Get alternatePhone
   * @return alternatePhone
  **/
  @ApiModelProperty(value = "")


  public Long getAlternatePhone() {
    return alternatePhone;
  }

  public void setAlternatePhone(Long alternatePhone) {
    this.alternatePhone = alternatePhone;
  }

  public OrderMaster city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(value = "")


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public OrderMaster customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Get customerId
   * @return customerId
  **/
  @ApiModelProperty(value = "")


  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public OrderMaster customerName(String customerName) {
    this.customerName = customerName;
    return this;
  }

  /**
   * Get customerName
   * @return customerName
  **/
  @ApiModelProperty(value = "")


  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public OrderMaster customerOrder(Long customerOrder) {
    this.customerOrder = customerOrder;
    return this;
  }

  /**
   * Get customerOrder
   * @return customerOrder
  **/
  @ApiModelProperty(value = "")


  public Long getCustomerOrder() {
    return customerOrder;
  }

  public void setCustomerOrder(Long customerOrder) {
    this.customerOrder = customerOrder;
  }

  public OrderMaster deliveryCharge(Double deliveryCharge) {
    this.deliveryCharge = deliveryCharge;
    return this;
  }

  /**
   * Get deliveryCharge
   * @return deliveryCharge
  **/
  @ApiModelProperty(value = "")


  public Double getDeliveryCharge() {
    return deliveryCharge;
  }

  public void setDeliveryCharge(Double deliveryCharge) {
    this.deliveryCharge = deliveryCharge;
  }

  public OrderMaster email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public OrderMaster expectedDelivery(OffsetDateTime expectedDelivery) {
    this.expectedDelivery = expectedDelivery;
    return this;
  }

  /**
   * Get expectedDelivery
   * @return expectedDelivery
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getExpectedDelivery() {
    return expectedDelivery;
  }

  public void setExpectedDelivery(OffsetDateTime expectedDelivery) {
    this.expectedDelivery = expectedDelivery;
  }

  public OrderMaster houseNoOrBuildingName(String houseNoOrBuildingName) {
    this.houseNoOrBuildingName = houseNoOrBuildingName;
    return this;
  }

  /**
   * Get houseNoOrBuildingName
   * @return houseNoOrBuildingName
  **/
  @ApiModelProperty(value = "")


  public String getHouseNoOrBuildingName() {
    return houseNoOrBuildingName;
  }

  public void setHouseNoOrBuildingName(String houseNoOrBuildingName) {
    this.houseNoOrBuildingName = houseNoOrBuildingName;
  }

  public OrderMaster id(Long id) {
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

  public OrderMaster landmark(String landmark) {
    this.landmark = landmark;
    return this;
  }

  /**
   * Get landmark
   * @return landmark
  **/
  @ApiModelProperty(value = "")


  public String getLandmark() {
    return landmark;
  }

  public void setLandmark(String landmark) {
    this.landmark = landmark;
  }

  public OrderMaster methodOfOrder(String methodOfOrder) {
    this.methodOfOrder = methodOfOrder;
    return this;
  }

  /**
   * Get methodOfOrder
   * @return methodOfOrder
  **/
  @ApiModelProperty(value = "")


  public String getMethodOfOrder() {
    return methodOfOrder;
  }

  public void setMethodOfOrder(String methodOfOrder) {
    this.methodOfOrder = methodOfOrder;
  }

  public OrderMaster name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OrderMaster notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Get notes
   * @return notes
  **/
  @ApiModelProperty(value = "")


  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public OrderMaster offerLines(List<OfferLine> offerLines) {
    this.offerLines = offerLines;
    return this;
  }

  public OrderMaster addOfferLinesItem(OfferLine offerLinesItem) {
    if (this.offerLines == null) {
      this.offerLines = new ArrayList<OfferLine>();
    }
    this.offerLines.add(offerLinesItem);
    return this;
  }

  /**
   * Get offerLines
   * @return offerLines
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<OfferLine> getOfferLines() {
    return offerLines;
  }

  public void setOfferLines(List<OfferLine> offerLines) {
    this.offerLines = offerLines;
  }

  public OrderMaster orderAcceptedAt(OffsetDateTime orderAcceptedAt) {
    this.orderAcceptedAt = orderAcceptedAt;
    return this;
  }

  /**
   * Get orderAcceptedAt
   * @return orderAcceptedAt
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getOrderAcceptedAt() {
    return orderAcceptedAt;
  }

  public void setOrderAcceptedAt(OffsetDateTime orderAcceptedAt) {
    this.orderAcceptedAt = orderAcceptedAt;
  }

  public OrderMaster orderDiscountAmount(Double orderDiscountAmount) {
    this.orderDiscountAmount = orderDiscountAmount;
    return this;
  }

  /**
   * Get orderDiscountAmount
   * @return orderDiscountAmount
  **/
  @ApiModelProperty(value = "")


  public Double getOrderDiscountAmount() {
    return orderDiscountAmount;
  }

  public void setOrderDiscountAmount(Double orderDiscountAmount) {
    this.orderDiscountAmount = orderDiscountAmount;
  }

  public OrderMaster orderFromCustomer(Long orderFromCustomer) {
    this.orderFromCustomer = orderFromCustomer;
    return this;
  }

  /**
   * Get orderFromCustomer
   * @return orderFromCustomer
  **/
  @ApiModelProperty(value = "")


  public Long getOrderFromCustomer() {
    return orderFromCustomer;
  }

  public void setOrderFromCustomer(Long orderFromCustomer) {
    this.orderFromCustomer = orderFromCustomer;
  }

  public OrderMaster orderLines(List<OrderLine> orderLines) {
    this.orderLines = orderLines;
    return this;
  }

  public OrderMaster addOrderLinesItem(OrderLine orderLinesItem) {
    if (this.orderLines == null) {
      this.orderLines = new ArrayList<OrderLine>();
    }
    this.orderLines.add(orderLinesItem);
    return this;
  }

  /**
   * Get orderLines
   * @return orderLines
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<OrderLine> getOrderLines() {
    return orderLines;
  }

  public void setOrderLines(List<OrderLine> orderLines) {
    this.orderLines = orderLines;
  }

  public OrderMaster orderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
    return this;
  }

  /**
   * Get orderNumber
   * @return orderNumber
  **/
  @ApiModelProperty(value = "")


  public String getOrderNumber() {
    return orderNumber;
  }

  public void setOrderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
  }

  public OrderMaster orderPlaceAt(OffsetDateTime orderPlaceAt) {
    this.orderPlaceAt = orderPlaceAt;
    return this;
  }

  /**
   * Get orderPlaceAt
   * @return orderPlaceAt
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getOrderPlaceAt() {
    return orderPlaceAt;
  }

  public void setOrderPlaceAt(OffsetDateTime orderPlaceAt) {
    this.orderPlaceAt = orderPlaceAt;
  }

  public OrderMaster orderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
    return this;
  }

  /**
   * Get orderStatus
   * @return orderStatus
  **/
  @ApiModelProperty(value = "")


  public String getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
  }

  public OrderMaster paymentRef(String paymentRef) {
    this.paymentRef = paymentRef;
    return this;
  }

  /**
   * Get paymentRef
   * @return paymentRef
  **/
  @ApiModelProperty(value = "")


  public String getPaymentRef() {
    return paymentRef;
  }

  public void setPaymentRef(String paymentRef) {
    this.paymentRef = paymentRef;
  }

  public OrderMaster paymentStatus(String paymentStatus) {
    this.paymentStatus = paymentStatus;
    return this;
  }

  /**
   * Get paymentStatus
   * @return paymentStatus
  **/
  @ApiModelProperty(value = "")


  public String getPaymentStatus() {
    return paymentStatus;
  }

  public void setPaymentStatus(String paymentStatus) {
    this.paymentStatus = paymentStatus;
  }

  public OrderMaster phone(Long phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(value = "")


  public Long getPhone() {
    return phone;
  }

  public void setPhone(Long phone) {
    this.phone = phone;
  }

  public OrderMaster pincode(String pincode) {
    this.pincode = pincode;
    return this;
  }

  /**
   * Get pincode
   * @return pincode
  **/
  @ApiModelProperty(value = "")


  public String getPincode() {
    return pincode;
  }

  public void setPincode(String pincode) {
    this.pincode = pincode;
  }

  public OrderMaster preOrderDate(OffsetDateTime preOrderDate) {
    this.preOrderDate = preOrderDate;
    return this;
  }

  /**
   * Get preOrderDate
   * @return preOrderDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getPreOrderDate() {
    return preOrderDate;
  }

  public void setPreOrderDate(OffsetDateTime preOrderDate) {
    this.preOrderDate = preOrderDate;
  }

  public OrderMaster roadNameAreaOrStreet(String roadNameAreaOrStreet) {
    this.roadNameAreaOrStreet = roadNameAreaOrStreet;
    return this;
  }

  /**
   * Get roadNameAreaOrStreet
   * @return roadNameAreaOrStreet
  **/
  @ApiModelProperty(value = "")


  public String getRoadNameAreaOrStreet() {
    return roadNameAreaOrStreet;
  }

  public void setRoadNameAreaOrStreet(String roadNameAreaOrStreet) {
    this.roadNameAreaOrStreet = roadNameAreaOrStreet;
  }

  public OrderMaster serviceCharge(Double serviceCharge) {
    this.serviceCharge = serviceCharge;
    return this;
  }

  /**
   * Get serviceCharge
   * @return serviceCharge
  **/
  @ApiModelProperty(value = "")


  public Double getServiceCharge() {
    return serviceCharge;
  }

  public void setServiceCharge(Double serviceCharge) {
    this.serviceCharge = serviceCharge;
  }

  public OrderMaster state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public OrderMaster storeIdpcode(String storeIdpcode) {
    this.storeIdpcode = storeIdpcode;
    return this;
  }

  /**
   * Get storeIdpcode
   * @return storeIdpcode
  **/
  @ApiModelProperty(value = "")


  public String getStoreIdpcode() {
    return storeIdpcode;
  }

  public void setStoreIdpcode(String storeIdpcode) {
    this.storeIdpcode = storeIdpcode;
  }

  public OrderMaster storeName(String storeName) {
    this.storeName = storeName;
    return this;
  }

  /**
   * Get storeName
   * @return storeName
  **/
  @ApiModelProperty(value = "")


  public String getStoreName() {
    return storeName;
  }

  public void setStoreName(String storeName) {
    this.storeName = storeName;
  }

  public OrderMaster storePhone(Long storePhone) {
    this.storePhone = storePhone;
    return this;
  }

  /**
   * Get storePhone
   * @return storePhone
  **/
  @ApiModelProperty(value = "")


  public Long getStorePhone() {
    return storePhone;
  }

  public void setStorePhone(Long storePhone) {
    this.storePhone = storePhone;
  }

  public OrderMaster storelocationName(String storelocationName) {
    this.storelocationName = storelocationName;
    return this;
  }

  /**
   * Get storelocationName
   * @return storelocationName
  **/
  @ApiModelProperty(value = "")


  public String getStorelocationName() {
    return storelocationName;
  }

  public void setStorelocationName(String storelocationName) {
    this.storelocationName = storelocationName;
  }

  public OrderMaster subTotal(Double subTotal) {
    this.subTotal = subTotal;
    return this;
  }

  /**
   * Get subTotal
   * @return subTotal
  **/
  @ApiModelProperty(value = "")


  public Double getSubTotal() {
    return subTotal;
  }

  public void setSubTotal(Double subTotal) {
    this.subTotal = subTotal;
  }

  public OrderMaster totalDue(Double totalDue) {
    this.totalDue = totalDue;
    return this;
  }

  /**
   * Get totalDue
   * @return totalDue
  **/
  @ApiModelProperty(value = "")


  public Double getTotalDue() {
    return totalDue;
  }

  public void setTotalDue(Double totalDue) {
    this.totalDue = totalDue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderMaster orderMaster = (OrderMaster) o;
    return Objects.equals(this.addressType, orderMaster.addressType) &&
        Objects.equals(this.allergyNote, orderMaster.allergyNote) &&
        Objects.equals(this.alternatePhone, orderMaster.alternatePhone) &&
        Objects.equals(this.city, orderMaster.city) &&
        Objects.equals(this.customerId, orderMaster.customerId) &&
        Objects.equals(this.customerName, orderMaster.customerName) &&
        Objects.equals(this.customerOrder, orderMaster.customerOrder) &&
        Objects.equals(this.deliveryCharge, orderMaster.deliveryCharge) &&
        Objects.equals(this.email, orderMaster.email) &&
        Objects.equals(this.expectedDelivery, orderMaster.expectedDelivery) &&
        Objects.equals(this.houseNoOrBuildingName, orderMaster.houseNoOrBuildingName) &&
        Objects.equals(this.id, orderMaster.id) &&
        Objects.equals(this.landmark, orderMaster.landmark) &&
        Objects.equals(this.methodOfOrder, orderMaster.methodOfOrder) &&
        Objects.equals(this.name, orderMaster.name) &&
        Objects.equals(this.notes, orderMaster.notes) &&
        Objects.equals(this.offerLines, orderMaster.offerLines) &&
        Objects.equals(this.orderAcceptedAt, orderMaster.orderAcceptedAt) &&
        Objects.equals(this.orderDiscountAmount, orderMaster.orderDiscountAmount) &&
        Objects.equals(this.orderFromCustomer, orderMaster.orderFromCustomer) &&
        Objects.equals(this.orderLines, orderMaster.orderLines) &&
        Objects.equals(this.orderNumber, orderMaster.orderNumber) &&
        Objects.equals(this.orderPlaceAt, orderMaster.orderPlaceAt) &&
        Objects.equals(this.orderStatus, orderMaster.orderStatus) &&
        Objects.equals(this.paymentRef, orderMaster.paymentRef) &&
        Objects.equals(this.paymentStatus, orderMaster.paymentStatus) &&
        Objects.equals(this.phone, orderMaster.phone) &&
        Objects.equals(this.pincode, orderMaster.pincode) &&
        Objects.equals(this.preOrderDate, orderMaster.preOrderDate) &&
        Objects.equals(this.roadNameAreaOrStreet, orderMaster.roadNameAreaOrStreet) &&
        Objects.equals(this.serviceCharge, orderMaster.serviceCharge) &&
        Objects.equals(this.state, orderMaster.state) &&
        Objects.equals(this.storeIdpcode, orderMaster.storeIdpcode) &&
        Objects.equals(this.storeName, orderMaster.storeName) &&
        Objects.equals(this.storePhone, orderMaster.storePhone) &&
        Objects.equals(this.storelocationName, orderMaster.storelocationName) &&
        Objects.equals(this.subTotal, orderMaster.subTotal) &&
        Objects.equals(this.totalDue, orderMaster.totalDue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressType, allergyNote, alternatePhone, city, customerId, customerName, customerOrder, deliveryCharge, email, expectedDelivery, houseNoOrBuildingName, id, landmark, methodOfOrder, name, notes, offerLines, orderAcceptedAt, orderDiscountAmount, orderFromCustomer, orderLines, orderNumber, orderPlaceAt, orderStatus, paymentRef, paymentStatus, phone, pincode, preOrderDate, roadNameAreaOrStreet, serviceCharge, state, storeIdpcode, storeName, storePhone, storelocationName, subTotal, totalDue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderMaster {\n");
    
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    allergyNote: ").append(toIndentedString(allergyNote)).append("\n");
    sb.append("    alternatePhone: ").append(toIndentedString(alternatePhone)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    customerOrder: ").append(toIndentedString(customerOrder)).append("\n");
    sb.append("    deliveryCharge: ").append(toIndentedString(deliveryCharge)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    expectedDelivery: ").append(toIndentedString(expectedDelivery)).append("\n");
    sb.append("    houseNoOrBuildingName: ").append(toIndentedString(houseNoOrBuildingName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    landmark: ").append(toIndentedString(landmark)).append("\n");
    sb.append("    methodOfOrder: ").append(toIndentedString(methodOfOrder)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    offerLines: ").append(toIndentedString(offerLines)).append("\n");
    sb.append("    orderAcceptedAt: ").append(toIndentedString(orderAcceptedAt)).append("\n");
    sb.append("    orderDiscountAmount: ").append(toIndentedString(orderDiscountAmount)).append("\n");
    sb.append("    orderFromCustomer: ").append(toIndentedString(orderFromCustomer)).append("\n");
    sb.append("    orderLines: ").append(toIndentedString(orderLines)).append("\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    orderPlaceAt: ").append(toIndentedString(orderPlaceAt)).append("\n");
    sb.append("    orderStatus: ").append(toIndentedString(orderStatus)).append("\n");
    sb.append("    paymentRef: ").append(toIndentedString(paymentRef)).append("\n");
    sb.append("    paymentStatus: ").append(toIndentedString(paymentStatus)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    pincode: ").append(toIndentedString(pincode)).append("\n");
    sb.append("    preOrderDate: ").append(toIndentedString(preOrderDate)).append("\n");
    sb.append("    roadNameAreaOrStreet: ").append(toIndentedString(roadNameAreaOrStreet)).append("\n");
    sb.append("    serviceCharge: ").append(toIndentedString(serviceCharge)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    storeIdpcode: ").append(toIndentedString(storeIdpcode)).append("\n");
    sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
    sb.append("    storePhone: ").append(toIndentedString(storePhone)).append("\n");
    sb.append("    storelocationName: ").append(toIndentedString(storelocationName)).append("\n");
    sb.append("    subTotal: ").append(toIndentedString(subTotal)).append("\n");
    sb.append("    totalDue: ").append(toIndentedString(totalDue)).append("\n");
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

