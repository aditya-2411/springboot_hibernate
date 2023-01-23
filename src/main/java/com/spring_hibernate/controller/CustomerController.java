package com.spring_hibernate.controller;

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
	
	@GetMapping("/Customers")
	public ResponseEntity<java.util.List<Customer>> getCustomers(){
		java.util.List<Customer> list=customerservice.getAllCustomers();
		
		if(list.size()<=0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.ok(list);
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
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer cst) {
		try {
			Customer cst1=customerservice.addCustomer(cst);
			return ResponseEntity.ok(cst1);
		}
		catch (Exception e){
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	
	@DeleteMapping("/Customers/{id}")
	public ResponseEntity <Void> deleteCustomer(@PathVariable("id") int id) {
		try{
			customerservice.deleteCustomer(id);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		catch(Exception e){
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	
	@PutMapping("/Customers/{id}")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer cst,@PathVariable("id") int id) {
		try {
			Customer cst1=customerservice.updateCustomer(cst, id);
			return ResponseEntity.ok(cst1);
		}
		catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}

}
