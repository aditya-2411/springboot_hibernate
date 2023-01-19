package com.spring_hibernate.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring_hibernate.data.Customer;
import com.spring_hibernate.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerservice;
	
	@GetMapping("/customers")
	public ResponseEntity<java.util.List<Customer>> getCustomers(){
		java.util.List<Customer> list=customerservice.getAllCustomers();
		
		if(list.size()<=0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(list));
	}
	
	@GetMapping("/Customers/{id}")
	public ResponseEntity<Customer> getCustomer(@PathVariable("id") int id) {
		Customer cst= customerservice.getCustomerById(id);
		if(cst==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.ok(cst);
	}
	
	@PostMapping("/Customers")
	public Customer addCustomer(@RequestBody Customer cst) {
		Customer cst1=customerservice.addCustomer(cst);
		return cst1;
	}
	
	
	@DeleteMapping("/Customers/{id}")
	public void deleteCustomer(@PathVariable("id") int id) {
		customerservice.deleteCustomer(id);
	}
	
	
	@PutMapping("/Customers/{id}")
	public Customer updateCustomer(@RequestBody Customer cst,@PathVariable("id") int id) {
		
		return customerservice.updateCustomer(cst, id);
	}

}
