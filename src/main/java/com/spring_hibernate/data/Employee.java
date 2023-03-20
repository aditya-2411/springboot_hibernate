package com.spring_hibernate.data;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity 
@Table(name="Employee_data")
public class Employee {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Employee_ID")
	private int id;
	
	@Column(name="Employee_name")
	private String name;
	
	@Column(name="Employee_city")
	private String city;
	
	@Column(name="Employee_email")
	private String email;
	 
	@OneToOne(cascade = CascadeType.ALL)
	private Profession job;
	
	
	
	public Profession getJob() {
		return job;
	}

	public void setJob(Profession job) {
		this.job = job;
	}

	public Employee(int id, String name, String city, String email, Profession job) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.email = email;
		this.job = job;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", email=" + email + "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
