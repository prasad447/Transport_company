package com.spring.transport.company.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
			PayRegister pr=new PayRegister();
			Tinstall tinstall=new Tinstall();
			QuizContact qc=new QuizContact();
			SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
					Session session=sessionFactory.openSession();
					session.beginTransaction();
					session.save(pr);
					session.save(tinstall);
					session.save(qc);
					session.getTransaction().commit();
					session.close();

			
	}

}
