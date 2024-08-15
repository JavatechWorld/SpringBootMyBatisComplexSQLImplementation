package com.spring.implementation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.implementation.mapper.CustomerMapper;
import com.spring.implementation.model.Customer;

@Service
public class CustomerService {
	private final CustomerMapper customerMapper;

    public CustomerService(CustomerMapper customerMapper) {
        this.customerMapper = customerMapper;
    }

    public List<Customer> searchCustomers(String firstName, String lastName, String city, String state) {
        return customerMapper.findCustomersByCriteria(firstName, lastName, city, state);
    }

    public void addCustomer(Customer customer) {
        customerMapper.insertCustomer(customer);
    }

}
