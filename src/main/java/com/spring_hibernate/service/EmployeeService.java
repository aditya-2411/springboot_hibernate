package com.spring_hibernate.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring_hibernate.data.Employee;
import com.spring_hibernate.repository.EmployeeRepository;

@Component
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeerepository;
	
	//get all employees
	public List<Employee> getAllEmployees(){
		List<Employee> list=(List<Employee>)employeerepository.findAll();
		return list;
	}
	
	//get employee by Id
	public Employee getEmployeeById(int id) {
		Employee cst=new Employee();
		try {
			cst=employeerepository.findEmployeeById(id);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return cst;
	}
	
	// add the employee
	
	public Employee addEmployee(Employee cst) {
		Employee cst1= employeerepository.save(cst);
		return cst1;
	}
	
	// delete the employee
	
	public void deleteEmployee(int id) {
		employeerepository.deleteById(id);
	}
	
	//update the employee
	
	public Employee updateEmployee(Employee cst, int id) {
		cst.setId(id);
		return employeerepository.save(cst);
	}
	
	
}
