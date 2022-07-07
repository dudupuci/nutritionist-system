package com.nutritionist.entities;

import java.util.ArrayList;
import java.util.List;

import com.nutritionist.entities.resources.NutritionistResources;

public class Nutritionist implements NutritionistResources {

	private String name;
	private String specialty;
	private Double salary;
	private List<Patient> patients = new ArrayList<>();

	public Nutritionist() {
	}

	public Nutritionist(String name, String specialty, Double salary) {
		this.name = name;
		this.specialty = specialty;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}

	@Override
	public String toString() {
		return "Nutritionist [name=" + name + ", function=" + specialty + ", salary=" + salary + "]";
	}

	@Override
	public void registerNutritonist(List<Nutritionist> list, Nutritionist nutritionist) {
		list.add(nutritionist);

	}

	@Override
	// check
	public void deleteNutritionistByIndex(List<Nutritionist> list, Nutritionist nutritionist) {
		list.remove(nutritionist);

	}

}
