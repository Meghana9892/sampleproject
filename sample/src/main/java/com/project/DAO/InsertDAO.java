package com.project.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.project.bean.Teacher;

public class InsertDAO {

	Configuration cfg = new Configuration().configure();
	SessionFactory factory = cfg.buildSessionFactory();
	Session session = factory.openSession();
	Transaction tx = session.beginTransaction();


	public void addTeacher(String tname,String temail,String tphone)
	{
		Teacher teacher = new Teacher(tname,temail,tphone);
		session.save(teacher);
		tx.commit();
		session.close();
		
	}
}
