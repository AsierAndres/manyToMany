package org.hibernate.andres.asierTarea5.impl;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.andres.hibernate.asierTarea5.HibernateSession;
import org.andres.hibernate.asierTarea5.DAO.DoctorDAO;
import org.andres.hibernate.asierTarea5.models.*;

public class HibernateDoctorDAO implements DoctorDAO {

	public List<Doctor> selectAll() {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		List<Doctor> doctors = session.createCriteria(Doctor.class).list();
		session.close();
		return doctors;
	}

	public void insert(Doctor doctor) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.merge(doctor);
		session.getTransaction().commit();
		session.close();
	}

}
