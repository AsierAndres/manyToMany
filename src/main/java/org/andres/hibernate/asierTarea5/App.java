package org.andres.hibernate.asierTarea5;

import java.util.ArrayList;
import java.util.List;
import org.andres.hibernate.asierTarea5.DAO.*;
import org.andres.hibernate.asierTarea5.models.*;
import org.hibernate.andres.asierTarea5.impl.*;

public class App {
	public static void main(String[] args) {
		DoctorDAO doctorDAO = new HibernateDoctorDAO();
		PatientDAO patientDAO = new HibernatePatientDAO();

		Doctor doctor1 =  new Doctor("Doc1", "Odontología");
		Patient paciente1 = new Patient("Pac1", "Hombre");
		Patient paciente2 = new Patient("Pac2", "Mujer");
		Doctor doctor2 =  new Doctor("Doc2", "Cardio");
		Patient paciente3 = new Patient("Pac3", "Hombre");
		Patient paciente31 = new Patient("Pac4", "Hombre");
		List<Doctor> doctors = new ArrayList<Doctor>();
		List<Patient> patients1 = new ArrayList<Patient>();
		List<Patient> patients2 = new ArrayList<Patient>();
		
		doctors.add(doctor1);
		doctors.add(doctor2);
		patients1.add(paciente1);
		patients1.add(paciente2);
		patients2.add(paciente31);
		patients2.add(paciente3);
		//Los pacientes no deberían tener un doctor en ver de una lista de doctores???
		doctor1.setPatients(patients1);
		doctor1.setPatients(patients2);
		paciente1.setDoctors(doctors);
		paciente2.setDoctors(doctors);
		doctorDAO.insert(doctor1);
		doctorDAO.insert(doctor2);

		List<Doctor> doctorsFromDB = doctorDAO.selectAll();
		for (Doctor doctores : doctorsFromDB) {
			String result = "";
			result = doctores.getName();
			System.out.println(result);
			List<Patient> patientsFromDB = doctores.getPatients();
				//Si usamos el toString() explota
			for (int i = 0; i < patientsFromDB.size(); i++) {
				System.out.println("   * " + patients1.get(i).getName());
			}
			for (int i = 0; i < patientsFromDB.size(); i++) {
				System.out.println("   * " + patients2.get(i).getName());
			}
		}
	}
}
