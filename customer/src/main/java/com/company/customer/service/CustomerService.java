package com.company.customer.service;

import com.company.customer.model.Customer;
import com.company.customer.repo.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author : Denis Samsonenko
 * @created : 03.05.2022
 */

@Service
@AllArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;

    public void registerCustomer(Customer customer) {
        customerRepository.save(customer);
    }
}
