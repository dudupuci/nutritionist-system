package com.nutritionist.entities;

import java.util.Date;
import java.util.List;

import com.nutritionist.entities.resources.PatientResources;

public class Patient implements PatientResources {

	private String name;
	private String sex;
	private Date birthDate;
	private Nutritionist nutritionist;

	public Patient() {
	}

	public Patient(String name, String sex, Date birthDate, Nutritionist nutritionist) {
		this.name = name;
		this.sex = sex;
		this.birthDate = birthDate;
		this.nutritionist = nutritionist;
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

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Nutritionist getNutritionist() {
		return nutritionist;
	}

	public void setNutritionist(Nutritionist nutritionist) {
		this.nutritionist = nutritionist;
	}

	@Override
	public String toString() {
		return "Patient [name=" + name + ", sex=" + sex + ", birthDate=" + birthDate + ", nutritionist="
				+ nutritionist.getName() + "]";
	}

	@Override
	public void registerPatient(List<Patient> list, Patient patient) {
		list.add(patient);

	}

}
