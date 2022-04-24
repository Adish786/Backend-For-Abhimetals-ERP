package com.abhimetals.serviceimpl;

import com.abhimetals.entity.Customer;
import com.abhimetals.repository.CustomerRepository;
import com.abhimetals.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceimpl implements CustomerService {

   @Autowired
  private CustomerRepository customerRepository;


    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> saveCustomers(List<Customer> customer) {
        return customerRepository.saveAll(customer);
    }

    @Override
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomerById(Integer id) {
        return customerRepository.findById(id).orElse(null);
    }

    /*
    @Override
    public Customer getCustomerByName(String name) {
        return customerRepository.findByNameIs(name);
    }
*/
    @Override
    public Customer updateCustomerById(Customer id) {
        Customer existingCustomer = customerRepository.findById(id.getId()).orElse(null);
        existingCustomer.setId(id.getId());
        existingCustomer.setName(id.getName());
        existingCustomer.setAddress(id.getAddress());
        existingCustomer.setCountry(id.getCountry());
        existingCustomer.setState(id.getState());
        existingCustomer.setCity(id.getCity());
        existingCustomer.setPhoneNumber(id.getPhoneNumber());
        existingCustomer.setEmailId(id.getEmailId());
        existingCustomer.setGstNumber(id.getGstNumber());
        existingCustomer.setPanNumber(id.getPanNumber());
        return customerRepository.save(existingCustomer);
    }

    @Override
    public String deleteCustomer(Integer id) {
        customerRepository.deleteById(id);
        return "Customer removed !! " + id;
    }
}
