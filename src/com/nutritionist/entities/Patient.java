package com.nutritionist.entities;

import java.time.Instant;

public class Patient {

	private String name;
	private Character sex;
	private Instant birthDate;
	private Nutritionist nutritionist;

	public Patient() {
	}

	public Patient(String name, Character sex, Instant birthDate, Nutritionist nutritionist) {
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

	public Character getSex() {
		return sex;
	}

	public void setSex(Character sex) {
		this.sex = sex;
	}

	public Instant getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Instant birthDate) {
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
		return "Patient [name=" + name + ", sex=" + sex + ", birthDate=" + birthDate + ", nutritionist=" + nutritionist.getName()
				+ "]";
	}
	

}
