package com.company.fraud.controller;

import com.company.fraud.service.FraudCheckService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Denis Samsonenko
 * @created : 03.05.2022
 */

@RestController
@RequestMapping("api/v1/fraud-check")
@AllArgsConstructor
public class FraudController {
    private final FraudCheckService fraudCheckService;

    @GetMapping(path = "{customerId}")
    public Boolean isFraudster(@PathVariable("customerId") Integer customerId) {
        return fraudCheckService.isFraudulentCustomer(customerId);
    }
}
