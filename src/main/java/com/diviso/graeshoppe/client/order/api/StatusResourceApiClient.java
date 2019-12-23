package com.diviso.graeshoppe.client.order.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.diviso.graeshoppe.client.order.ClientConfiguration;

@FeignClient(name="${order.name:order}", url="${order.url:dev.ci2.divisosofttech.com:8088/}", configuration = ClientConfiguration.class)
public interface StatusResourceApiClient extends StatusResourceApi {
}