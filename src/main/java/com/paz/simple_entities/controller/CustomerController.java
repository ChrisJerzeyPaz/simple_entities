package com.paz.simple_entities.controller;

import com.paz.simple_entities.model.Customer;
import com.paz.simple_entities.services.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    public ResponseEntity<Customer> editCustomer(@PathVariable int customerId, @RequestBody Customer customer) {
        Customer edited= customerService.editCustomer(customerId, customer);
        if(edited != null) {
            return ResponseEntity.ok(edited);
        } else {
            return ResponseEntity.notFound().build();
        }
}