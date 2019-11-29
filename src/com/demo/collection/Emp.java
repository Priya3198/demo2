package com.demo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="emp_tab")
public class Emp { 
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String phone;
	private double salary;
	
	@ElementCollection(fetch=FetchType.EAGER)
	@CollectionTable(name="emp_emails")
	@Column(name="email")
	private List<String>emails=new ArrayList<>();
	
	@ElementCollection(fetch=FetchType.EAGER)
	@CollectionTable(name="emp_kids")
	private Map<String, Integer>kidsInfo=new HashMap<String, Integer>();
	
	public Map<String, Integer> getKidsInfo() {
		return kidsInfo;
	}
	public void setKidsInfo(Map<String, Integer> kidsInfo) {
		this.kidsInfo = kidsInfo;
	}
	public List<String> getEmails() {
		return emails;
	}
	public void setEmails(List<String> emails) {
		this.emails = emails;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Emp(String name, String phone, double salary) {
		super();
		
		this.name = name;
		this.phone = phone;
		this.salary = salary;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", phone=" + phone + ", salary=" + salary + "]";
	}
	

}
