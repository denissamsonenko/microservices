package com.company.customer.repo;

import com.company.customer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Denis Samsonenko
 * @created : 03.05.2022
 */
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
