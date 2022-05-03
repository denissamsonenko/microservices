package com.company.fraud.controller;

import com.company.fraud.dto.FraudResponse;
import com.company.fraud.service.FraudCheckService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Denis Samsonenko
 * @created : 03.05.2022
 */

@Slf4j
@RestController
@RequestMapping("api/v1/fraud-check")
@AllArgsConstructor
public class FraudController {
    private final FraudCheckService fraudCheckService;

    @GetMapping(path = "{customerId}")
    public FraudResponse isFraudster(@PathVariable("customerId") Integer customerId) {
        Boolean isFraud = fraudCheckService.isFraudulentCustomer(customerId);
        log.info("fraud check for customer {}", customerId);
        return new FraudResponse(isFraud);
    }
}
