package com.zomato.pkg;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ZomatoUser {
	
	public static void main(String[] args){
			
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		Session session =sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(Spr.profile);
		
		session.getTransaction().commit();
		session.close();
	}

}
