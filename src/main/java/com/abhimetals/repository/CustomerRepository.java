package com.abhimetals.repository;

import com.abhimetals.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer>{
  //  Customer findByNameIs(String name);
}
