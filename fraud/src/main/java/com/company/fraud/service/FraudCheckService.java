package com.company.fraud.service;

import com.company.fraud.model.FraudCheckHistory;
import com.company.fraud.repo.FraudCheckHistoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * @author : Denis Samsonenko
 * @created : 03.05.2022
 */

@Service
@AllArgsConstructor
public class FraudCheckService {
    private final FraudCheckHistoryRepository fraudRepository;

    public Boolean isFraudulentCustomer(Integer customerId) {
        fraudRepository.save(FraudCheckHistory.builder()
                .customerId(customerId)
                .isFraudster(false)
                .createdAt(LocalDateTime.now())
                .build());

        return false;
    }
}
