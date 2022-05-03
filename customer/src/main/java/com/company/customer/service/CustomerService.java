package com.company.customer.service;

import com.company.customer.dto.FraudResponse;
import com.company.customer.model.Customer;
import com.company.customer.repo.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author : Denis Samsonenko
 * @created : 03.05.2022
 */

@Service
@AllArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;
    private final RestTemplate restTemplate;

    public void registerCustomer(Customer customer) {
        customerRepository.saveAndFlush(customer);

        FraudResponse fraudCheck = restTemplate.getForObject(
                "http://FRAUD/api/v1/fraud-check/{customerId}",
                FraudResponse.class,
                customer.getId());

        if (fraudCheck.getIsFraudster()) {
            throw new IllegalStateException("fraudster");
        }
    }
}
