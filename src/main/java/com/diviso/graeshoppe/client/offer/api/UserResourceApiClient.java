package com.diviso.graeshoppe.client.offer.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.diviso.graeshoppe.client.offer.ClientConfiguration;

@FeignClient(name="${offer.name:offer}", url="${offer.url:dev.ci2.divisosofttech.com:8095/Offer}", configuration = ClientConfiguration.class)
public interface UserResourceApiClient extends UserResourceApi {
}