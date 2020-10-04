package com.mindgeek.nutaku.services.purchaseservice.resources;

import com.mindgeek.nutaku.services.purchaseservice.clients.PaymentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class indexController {

    @Value("${spring.cloud.consul.discovery.instance-id}")
    private String instanceId;

    @Value("${max-balance}")
    private String maxBalance;


    private PaymentService paymentService;

    public indexController( PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping
    public String index(){
        return "instance " + instanceId + ", says Hello from payment " + paymentService.hello();
    }

    @GetMapping("/hello")
    public String hello(){

        return "hello from purchase " + maxBalance;
    }
}
