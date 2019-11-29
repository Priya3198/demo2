package com.demo.manytomany;

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
		
		Project p1=new Project("java","kapil",20);
		Project p2=new Project("spring","priya",20);
		
		
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
		
		p1.getEmps().add(emp1);
		p1.getEmps().add(emp2);
		p1.getEmps().add(emp3);
		p1.getEmps().add(emp4);
		p1.getEmps().add(emp5);

		p2.getEmps().add(emp6);
		p2.getEmps().add(emp7);
		p2.getEmps().add(emp8);
		
		p1.getEmps().add(emp6);
		p1.getEmps().add(emp7);
		
		emp1.getProjects().add(p1);
		emp2.getProjects().add(p1);
		emp3.getProjects().add(p1);
		emp4.getProjects().add(p1);
		emp5.getProjects().add(p1);
		
		emp6.getProjects().add(p2);
		emp7.getProjects().add(p2);
		emp8.getProjects().add(p2);
		
		emp6.getProjects().add(p1);
		emp7.getProjects().add(p1);
		
		
		
		
		
		
		session.save(p1);
		session.save(p2);
		
		session.save(emp1);
		session.save(emp2);
		session.save(emp3);
		session.save(emp4);
		session.save(emp5);
		session.save(emp6);
		session.save(emp7);
		session.save(emp8);
		
		
		
		
		
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
