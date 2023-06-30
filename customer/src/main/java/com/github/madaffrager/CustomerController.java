package com.github.madaffrager;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/customers")
@AllArgsConstructor
public class CustomerController{
    private final CustomerService customerService;
    @PostMapping
    public void registerCustomer(@RequestBody CustomerRegistrationRequest customerRequest){
        log.info("New customer registration {}",customerRequest);
        customerService.registerCustomer(customerRequest);

    }
}
