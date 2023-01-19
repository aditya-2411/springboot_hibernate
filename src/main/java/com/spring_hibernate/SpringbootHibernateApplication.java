package com.spring_hibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.spring_hibernate.data.Customer;
import com.spring_hibernate.repository.CustomerRepository;

@SpringBootApplication
public class SpringbootHibernateApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringbootHibernateApplication.class, args);
		
		
		CustomerRepository customerrepository=context.getBean(CustomerRepository.class);
		
		//create new customer object
//		Customer cst= new Customer();
//		
//		//set the data 
//		cst.setName("Aditya");
//		cst.setCity("sikar");
//		cst.setEmail("aditya@gmail.com");
//		
//		// save the customer object, changes can be observed in database
//		//save method for single customer and it returns the customer object which is saved
//		Customer result1=customerrepository.save(cst);
//		
//		System.out.println(result1);
//	
	
//		// create two more customers object
//		Customer cst3 = new Customer();
//		cst3.setName("Rahul");
//		cst3.setCity("Delhi");
//		cst3.setEmail("rahul@gmail.com");
//		
//
//		Customer cst4 = new Customer();
//		cst4.setName("Rohit");
//		cst4.setCity("mumbai");
//		cst4.setEmail("rohit@gmail.com");
//		
//		// add them to a list
//		List<Customer> list1=List.of(cst3,cst4);
//		//old method to add elements to list
//		//List<Customer> list1=new ArrayList<Customer>();
//		//Collections.addAll(list1,cst3,cst4);
//		
//		// saveall method to save multiple customers at a time and this will return a list
//		Iterable<Customer> result2=customerrepository.saveAll(list1);
//		
//		// for each loop using lambda to print all the customers in result2
//		result2.forEach(x->{
//			System.out.println(x);
//		});
//		
//		// update any data to existing data
//		//update the city of customer whose id is 152
//		
//		//findById method used, returns optional type of object
//		Optional<Customer> optional= customerrepository.findById(152);
//		
//		//using get method
//		Customer cst5=optional.get();
//		
//		//update the city
//		cst5.setCity("Jaipur");
//		
//		//save the customer and the city name will be updated
//		Customer res=customerrepository.save(cst5);
//		System.out.println(res);
//		
//		
//		//how to get the data
//		//findById(id)  - returns Optional containing your data
//		
//		//findAll()  - returns all instances of the type
//		Iterable<Customer> itr=customerrepository.findAll();
//		itr.forEach(x->{
//			System.out.println(x);
//		});
//		
//		// how to delete the data
//		//deleteById(id) - deletes the data of cutomer whose id we provide
//		customerrepository.deleteById(153);
//		
//		//deleteAll(list1) - deletes all the data of the customers which are in list1
//		
//		Iterable<Customer> list2=customerrepository.findAll();
//		customerrepository.deleteAll(list2);
		
		
		
		
		
	}

}
 