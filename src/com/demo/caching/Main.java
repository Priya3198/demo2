package com.demo.caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;


public class Main {
	public static void main(String[] args) {
		SessionFactory factory=null;
		Session session=null;
		Session session1=null;
		try{
		 factory= new AnnotationConfiguration().configure().buildSessionFactory();
		
		 
		 session=factory.openSession();
		 Emp emp=(Emp) session.createQuery("select e from Emp e where id=:id").setInteger("id",1).setCacheable(true).uniqueResult();
		// Emp emp=(Emp) session.get(Emp.class, 1);
		 session.close();
		 
		 session1=factory.openSession();
		 Emp emp1=(Emp) session1.createQuery("select e from Emp e where id=:id").setInteger("id",1).setCacheable(true).uniqueResult();

		 //Emp emp2=(Emp) session1.get(Emp.class, 2);
		 session1.close();
		 
		 
		/*session.getTransaction().begin();
		Emp emp =new Emp("raj","90909",800.00);
		Emp emp1 =new Emp("priya","90909",900.00);
		session.save(emp);
		session.save(emp1);
		session.getTransaction().commit();
		session.close();*/
	}catch(Exception e){
		e.printStackTrace();
	}
		finally {
			
			factory.close();
		}

}
}
