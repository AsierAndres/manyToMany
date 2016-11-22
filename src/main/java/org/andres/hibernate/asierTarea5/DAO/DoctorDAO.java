package org.andres.hibernate.asierTarea5.DAO;

import java.util.List;
import org.andres.hibernate.asierTarea5.models.Doctor;

public interface DoctorDAO {
	public List<Doctor> selectAll();
	public void insert(Doctor doctor);
}
