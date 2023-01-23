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
@Table(name="Customer_data")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Customer_ID")
	private int id;
	
	@Column(name="Customer_name")
	private String name;
	
	@Column(name="Customer_city")
	private String city;
	
	@Column(name="Customer_email")
	private String email;
	 
	@OneToOne(cascade = CascadeType.ALL)
	private Profession job;
	
	public Customer(int id, String name, String city, String email) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.email = email;
	}
	
	public Profession getJob() {
		return job;
	}

	public void setJob(Profession job) {
		this.job = job;
	}

	public Customer(int id, String name, String city, String email, Profession job) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.email = email;
		this.job = job;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", city=" + city + ", email=" + email + "]";
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
