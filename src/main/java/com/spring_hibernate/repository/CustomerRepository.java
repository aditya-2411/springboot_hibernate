package com.spring_hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring_hibernate.data.Customer;

//we only need to create customerrepository which extends jparepository which will provide
//us the basic methods such as save, find, delete etc. 

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	Customer findCustomerById(int id);
	
}
