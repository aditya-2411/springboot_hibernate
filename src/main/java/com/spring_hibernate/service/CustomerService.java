package com.spring_hibernate.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring_hibernate.data.Customer;
import com.spring_hibernate.repository.CustomerRepository;

@Component
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerrepository;
	
	//get all customers
	public List<Customer> getAllCustomers(){
		List<Customer> list=(List<Customer>)customerrepository.findAll();
		return list;
	}
	
	//get customer by Id
	public Customer getCustomerById(int id) {
		Customer cst=new Customer();
		try {
			cst=customerrepository.findCustomerById(id);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return cst;
	}
	
	// add the customer
	
	public Customer addCustomer(Customer cst) {
		Customer cst1= customerrepository.save(cst);
		return cst1;
	}
	
	// delete the customer
	
	public void deleteCustomer(int id) {
		customerrepository.deleteById(id);
	}
	
	//update the customer
	
	public Customer updateCustomer(Customer cst, int id) {
		cst.setId(id);
		return customerrepository.save(cst);
	}
	
	
}
