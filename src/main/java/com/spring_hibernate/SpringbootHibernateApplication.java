package com.spring_hibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.spring_hibernate.data.Employee;
import com.spring_hibernate.repository.EmployeeRepository;

@SpringBootApplication
public class SpringbootHibernateApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringbootHibernateApplication.class, args);
		
		
		EmployeeRepository employeerepository=context.getBean(EmployeeRepository.class);
		
		//create new employee object
//		Employee cst= new Employee();
//		
//		//set the data 
//		cst.setName("Aditya");
//		cst.setCity("sikar");
//		cst.setEmail("aditya@gmail.com");
//		
//		// save the employee object, changes can be observed in database
//		//save method for single employee and it returns the employee object which is saved
//		Employee result1=employeerepository.save(cst);
//		
//		System.out.println(result1);
	
	
//		// create two more employees object
//		Employee cst3 = new Employee();
//		cst3.setName("Rahul");
//		cst3.setCity("Delhi");
//		cst3.setEmail("rahul@gmail.com");
//		
//
//		Employee cst4 = new Employee();
//		cst4.setName("Rohit");
//		cst4.setCity("mumbai");
//		cst4.setEmail("rohit@gmail.com");
//		
//		// add them to a list
//		List<Employee> list1=List.of(cst3,cst4);
//		//old method to add elements to list
//		//List<Employee> list1=new ArrayList<Employee>();
//		//Collections.addAll(list1,cst3,cst4);
//		
//		// saveall method to save multiple employees at a time and this will return a list
//		Iterable<Employee> result2=employeerepository.saveAll(list1);
//		
//		// for each loop using lambda to print all the employees in result2
//		result2.forEach(x->{
//			System.out.println(x);
//		});
//		
//		// update any data to existing data
//		//update the city of employee whose id is 152
//		
//		//findById method used, returns optional type of object
//		Optional<Employee> optional= employeerepository.findById(152);
//		
//		//using get method
//		Employee cst5=optional.get();
//		
//		//update the city
//		cst5.setCity("Jaipur");
//		
//		//save the employee and the city name will be updated
//		Employee res=employeerepository.save(cst5);
//		System.out.println(res);
//		
//		
//		//how to get the data
//		//findById(id)  - returns Optional containing your data
//		
//		//findAll()  - returns all instances of the type
//		Iterable<Employee> itr=employeerepository.findAll();
//		itr.forEach(x->{
//			System.out.println(x);
//		});
//		
//		// how to delete the data
//		//deleteById(id) - deletes the data of cutomer whose id we provide
//		employeerepository.deleteById(153);
//		
//		//deleteAll(list1) - deletes all the data of the employees which are in list1
//		
//		Iterable<Employee> list2=employeerepository.findAll();
//		employeerepository.deleteAll(list2);
		
		
		
		
		
	}

}
 