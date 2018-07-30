package com.rohit.customer.service.controller;

import com.rohit.customer.service.domain.model.Customer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

    @RequestMapping(value = "/{id}")
    public Customer getCustomer(@PathVariable long customerId) {
        return new Customer();
    }
}
