package com.demo.onetoone;

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
		
		List<Parking>parks=session.createQuery("from Parking p join fetch p.emp Emp").list();
		for(Parking p:parks){
			System.out.println(p.getLoc());
		}
		
		/*
		Emp emp =new Emp("raj","90909",800.00);
		Emp emp1 =new Emp("priya","98989",900.00);
		Emp emp2 =new Emp("livi","77777",700.00);
		
		Parking parking1= new Parking("A123",100);
		Parking parking2= new Parking("T456",900);
		Parking parking3= new Parking("O987",500);
		
		emp.setParking(parking1);
		emp1.setParking(parking2);
		emp2.setParking(parking3);
		
		parking1.setEmp(emp);
	parking2.setEmp(emp1);
		parking3.setEmp(emp2);
		
		session.save(emp);
		session.save(emp1);
		session.save(emp2);
		
		session.save(parking1);
		session.save(parking2);
		session.save(parking3);
		*/
		
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
