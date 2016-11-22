package org.hibernate.andres.asierTarea5.impl;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.andres.hibernate.asierTarea5.HibernateSession;
import org.andres.hibernate.asierTarea5.DAO.PatientDAO;
import org.andres.hibernate.asierTarea5.models.Patient;

public class HibernatePatientDAO implements PatientDAO {

	public List<Patient> selectAll() {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		List<Patient> patients = session.createCriteria(Patient.class).list();
		session.close();
		return patients;
	}

	public void insert(Patient patient) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.merge(patient);
		session.getTransaction().commit();
		session.close();
	}

}
