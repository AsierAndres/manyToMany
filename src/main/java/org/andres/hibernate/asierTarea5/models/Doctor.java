package org.andres.hibernate.asierTarea5.models;

import java.util.List;

public class Doctor {
	private Long id;
	private String name;
	private String area;
	private List<Patient> patients;

	public Doctor() {
		super();
	}

	public Doctor(String name, String area) {
		super();
		this.name = name;
		this.area = area;
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

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", area=" + area + ", patients=" + patients + "]";
	}
}
