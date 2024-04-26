package com.paz.simple_entities.services;

import com.paz.simple_entities.model.Customer;
import com.paz.simple_entities.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List

public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer editCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
