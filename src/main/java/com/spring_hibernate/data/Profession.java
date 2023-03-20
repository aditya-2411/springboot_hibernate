package com.spring_hibernate.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Profession {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int jobid;
	private String jobprofile;
	
	@Column(name="preffered_language")
	private String preflang;
	
	public Profession(int jobid, String jobprofile, String preflang) {
		super();
		this.jobid = jobid;
		this.jobprofile = jobprofile;
		this.preflang = preflang;
	}
	
	public Profession() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Profession [jobid=" + jobid + ", jobprofile=" + jobprofile + ", preflang=" + preflang + "]";
	}
	
	public int getJobid() {
		return jobid;
	}
	public void setJobid(int jobid) {
		this.jobid = jobid;
	}
	public String getJobprofile() {
		return jobprofile;
	}
	public void setJobprofile(String jobprofile) {
		this.jobprofile = jobprofile;
	}
	public String getPreflang() {
		return preflang;
	}
	public void setPreflang(String preflang) {
		this.preflang = preflang;
	}
	
	
	
}
