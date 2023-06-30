package com.github.madaffrager;

import com.github.madaffrager.clients.fraud.FraudCheckResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/fraud-check")
@AllArgsConstructor
@Slf4j
public class FraudCheckController {
    private final FraudCheckService fraudCheckService;


    @GetMapping(path = "{customerId}")

    public FraudCheckResponse isFraudster(@PathVariable("customerId") Integer customerId){
        boolean isFraud = fraudCheckService.isFraudulentCustomer(customerId);
        log.info("Fraud check for customer {}",customerId);
        return new FraudCheckResponse(isFraud);
    }
}
