package org.andres.hibernate.asierTarea5.models;

import java.util.List;

public class Patient {
	private Long id;
	private String name;
	private String sex;
	private List<Doctor> doctors;

	public Patient() {
		super();
	}

	public Patient(String name, String sex) {
		super();
		this.name = name;
		this.sex = sex;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public List<Doctor> getDoctors() {
		return doctors;
	}

	public void setDoctors(List<Doctor> doctors) {
		this.doctors = doctors;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", sex=" + sex + ", doctors=" + doctors + "]";
	}	
}
