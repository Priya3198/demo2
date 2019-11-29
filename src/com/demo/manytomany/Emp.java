package com.demo.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Entity
@Table(name="hib_emp1")
public class Emp { 
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String phone;
	private double salary;
	
	@ManyToMany
	@JoinTable(name="emp_pro_jt",
	joinColumns=@JoinColumn(name="eid_fk"),
	inverseJoinColumns=@JoinColumn(name="pid_fk"))
	private List<Project>projects=new ArrayList<Project>();
			
			
			
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
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
