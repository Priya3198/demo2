package com.demo.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="hib_pro")
public class Project {
	
	@Id
	@GeneratedValue
	private int pid;
	private String pname;
	private String manager;
	private double budget;
	@ManyToMany(mappedBy="projects")
	private List<Emp>emps=new ArrayList<Emp>();
	
	
	public List<Emp> getEmps() {
		return emps;
	}
	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	public Project(String pname, String manager, double budget) {
		super();
		this.pname = pname;
		this.manager = manager;
		this.budget = budget;
	}
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Project [pid=" + pid + ", pname=" + pname + ", manager=" + manager + ", budget=" + budget + "]";
	}
	
	
	

}
