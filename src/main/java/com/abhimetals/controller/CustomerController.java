package com.abhimetals.controller;

import com.abhimetals.entity.Customer;
import com.abhimetals.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService service;

    @RequestMapping(value = "/addCustomer",method = RequestMethod.POST)
    public Customer addCustomer(@RequestBody Customer customer) {
        return service.saveCustomer(customer);
    }

    @RequestMapping(value = "/addCustomers",method = RequestMethod.POST)
    public List<Customer> addCustomers(@RequestBody List<Customer> customers) {
        return service.saveCustomers(customers);
    }

    @RequestMapping(value = "/customers",method = RequestMethod.GET)
    public List<Customer> findAllCustomers() {
        return service.getCustomers();
    }

    @RequestMapping(value = "/customerById/{id}",method = RequestMethod.GET)
    public Customer findCustomerById(@PathVariable Integer id) {

        return service.getCustomerById(id);
    }
/*
    @RequestMapping(value = "/customer/{name}",method = RequestMethod.GET)
    public Customer findCustomerByName(@PathVariable String name) {
        return service.getCustomerByName(name);
    }
*/
    @RequestMapping(value = "/customerupdate",method = RequestMethod.PUT)
    public Customer updateCustomer(@RequestBody Customer id) {
        return service.updateCustomerById(id);
    }

    @RequestMapping(value = "/deletecustomer/{id}",method = RequestMethod.DELETE)
    public String deleteCustomer(@PathVariable Integer id) {

        return service.deleteCustomer(id);
    }

}
