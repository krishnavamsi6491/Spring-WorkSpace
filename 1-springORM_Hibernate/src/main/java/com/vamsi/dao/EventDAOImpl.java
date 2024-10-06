package com.vamsi.dao;

import java.awt.Event;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class EventDAOImpl implements EventDAO {

	private SessionFactory factory = HibernateUtils.getFactory();

	public void save(Event e) {
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(e);
		session.getTransaction().commit();
		session.close();
	}

}
