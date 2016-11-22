package org.andres.hibernate.asierTarea5.DAO;

import java.util.List;
import org.andres.hibernate.asierTarea5.models.Patient;

public interface PatientDAO {
	public List<Patient> selectAll();
	public void insert(Patient patient);
}
