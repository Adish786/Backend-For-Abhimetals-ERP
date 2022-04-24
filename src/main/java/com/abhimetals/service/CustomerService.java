package com.abhimetals.service;

import com.abhimetals.entity.Customer;

import java.util.List;

public interface CustomerService {

    Customer saveCustomer(Customer customer);

    List<Customer> saveCustomers(List<Customer> customer);

    List<Customer> getCustomers();

    Customer getCustomerById(Integer id);

 //   Customer getCustomerByName(String name);

    Customer updateCustomerById(Customer id);

  //  Customer updateCustomerByName(Customer name);

    String deleteCustomer(Integer id);
}
