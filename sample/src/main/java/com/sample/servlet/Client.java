package com.sample.servlet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {
	
	public void addname(String name)
	{
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		String sname = name;
		
		sample s = new sample(sname);
		session.save(s);
		tx.commit();
		session.close();
	}

}
