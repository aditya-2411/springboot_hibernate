package com.spring_hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring_hibernate.data.Employee;

//we only need to create employeerepository which extends jparepository which will provide
//us the basic methods such as save, find, delete etc. 

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	Employee findEmployeeById(int id);
	
}
