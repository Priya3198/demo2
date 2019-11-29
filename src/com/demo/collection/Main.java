package com.demo.collection;

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
		Emp emp =new Emp("raj","90909",800.00);
		session.save(emp);
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
