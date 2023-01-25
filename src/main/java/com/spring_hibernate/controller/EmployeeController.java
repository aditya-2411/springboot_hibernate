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

import com.spring_hibernate.data.Employee;
import com.spring_hibernate.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeservice;
	
	@GetMapping("/Employees")
	public ResponseEntity<java.util.List<Employee>> getEmployees(){
		java.util.List<Employee> list=employeeservice.getAllEmployees();
		
		if(list.size()<=0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.ok(list);
	}
	
	@GetMapping("/Employees/{id}")
	public ResponseEntity<Employee> getEmployee(@PathVariable("id") int id) {
		Employee cst= employeeservice.getEmployeeById(id);
		if(cst==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.ok(cst);
	}
	
	@PostMapping("/Employees")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee cst) {
		try {
			Employee cst1=employeeservice.addEmployee(cst);
			return ResponseEntity.ok(cst1);
		}
		catch (Exception e){
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	
	@DeleteMapping("/Employees/{id}")
	public ResponseEntity <Void> deleteEmployee(@PathVariable("id") int id) {
		try{
			employeeservice.deleteEmployee(id);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		catch(Exception e){
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	
	@PutMapping("/Employees/{id}")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee cst,@PathVariable("id") int id) {
		try {
			Employee cst1=employeeservice.updateEmployee(cst, id);
			return ResponseEntity.ok(cst1);
		}
		catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}

}
