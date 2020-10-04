package com.mindgeek.nutaku.services.paymentservice.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class indexController {

    @GetMapping
    public String index(){
        return "hello";
    }

    @GetMapping(path = "/hello")
    public String hello(){
        return "hello from payment service";
    }
}
