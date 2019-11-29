package com.demo.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="hib_dep1")
public class Department {
	
	@Id
	@GeneratedValue
	private int did;
	private String name;
	private String address;
	
	@OneToMany(mappedBy="dept",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Emp>emps=new ArrayList<Emp>();
	
	public void addEmp(Emp emp){
		emps.add(emp);
	}
	
	
	public List<Emp> getEmps() {
		return emps;
	}


	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}


	public int getId() {
		return did;
	}
	public void setId(int did) {
		this.did = did;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Department(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	public Department() {
		super();
	}
	@Override
	public String toString() {
		return "Department [did=" + did + ", name=" + name + ", address=" + address + "]";
	}
	

}
