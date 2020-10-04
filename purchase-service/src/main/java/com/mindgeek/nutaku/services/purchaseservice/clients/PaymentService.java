package com.mindgeek.nutaku.services.purchaseservice.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("PAYMENT-SERVICE")
public interface PaymentService {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    String hello();
}
