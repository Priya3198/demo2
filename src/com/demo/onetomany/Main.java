package com.demo.onetomany;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;



public class Main {
	public static void main(String[] args) {
		SessionFactory factory=null;
		Session session=null;
		try{
		 factory= new AnnotationConfiguration().configure().buildSessionFactory();
		 session=factory.openSession();
		session.getTransaction().begin();
		
		Department dept1=new Department("cs","HCL");
		Department dept2=new Department("ece","TcS");
		Department dept3=new Department("it","XYZ");
		
		
		Emp emp1 =new Emp("raj","90909",800.00);
		Emp emp2 =new Emp("priya","98989",900.00);
		Emp emp3 =new Emp("livi","77777",700.00);
		Emp emp4 =new Emp("raja","90909",800.00);
		Emp emp5 =new Emp("shahana","98989",900.00);
		Emp emp6 =new Emp("shalu","77777",700.00);
		Emp emp7 =new Emp("surya","90909",800.00);
		Emp emp8 =new Emp("ravi","98989",900.00);
		Emp emp9 =new Emp("ram","77777",700.00);
		Emp emp10 =new Emp("janani","90909",800.00);
		Emp emp11 =new Emp("pri","98989",900.00);
		Emp emp12 =new Emp("keerthu","77777",700.00);
		
		
		dept1.getEmps().add(emp1);
		dept1.getEmps().add(emp2);
		dept1.getEmps().add(emp3);
		dept1.getEmps().add(emp4);
		dept1.getEmps().add(emp5);

		dept2.getEmps().add(emp6);
		dept2.getEmps().add(emp7);
		dept2.getEmps().add(emp8);
		dept2.getEmps().add(emp9);
		dept2.getEmps().add(emp10);
		dept2.getEmps().add(emp11);
		dept2.getEmps().add(emp12);
		
		emp1.setDept(dept1);
		emp2.setDept(dept1);
		emp3.setDept(dept1);
		emp4.setDept(dept1);
		emp5.setDept(dept1);
		
		emp6.setDept(dept2);
		emp7.setDept(dept2);
		emp8.setDept(dept2);
		emp9.setDept(dept2);
		emp10.setDept(dept2);
		emp11.setDept(dept2);
		emp12.setDept(dept2);
		
		
		
		session.save(dept1);
		session.save(dept2);
		
		session.save(emp1);
		session.save(emp2);
		session.save(emp3);
		session.save(emp4);
		session.save(emp5);
		session.save(emp6);
		session.save(emp7);
		session.save(emp8);
		session.save(emp9);
		session.save(emp10);
		session.save(emp11);
		session.save(emp12);
		
		
		
		
		session.getTransaction().commit();
		
	}catch(Exception e){
		e.printStackTrace();
	}
		finally {
			session.close();
			factory.close();
		}

}
}
