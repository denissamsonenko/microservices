package com.company.fraud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : Denis Samsonenko
 * @created : 03.05.2022
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FraudResponse {
    private Boolean isFraudster;
}
