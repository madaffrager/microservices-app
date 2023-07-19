package com.github.madaffrager.customer;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration

public class CustomerConfig {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
