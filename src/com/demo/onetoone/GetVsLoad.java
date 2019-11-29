package com.demo.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class GetVsLoad {
	
	public static void main(String[] args) {
		SessionFactory factory=null;
		Session session=null;
		 factory= new AnnotationConfiguration().configure().buildSessionFactory();
		 session=factory.openSession();
		session.getTransaction().begin();
		Emp emp=(Emp) session.get(Emp.class, 1);
		
		}
}
