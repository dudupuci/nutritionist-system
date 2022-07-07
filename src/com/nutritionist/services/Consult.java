package com.nutritionist.services;

import java.time.Instant;

import com.nutritionist.entities.Patient;

public class Consult {

	private Instant date;
	private Double price;
	private Patient patient;

	public Consult() {
	}

	public Consult(Instant date, Double price, Patient patient) {
		this.date = date;
		this.price = price;
		this.patient = patient;
	}

	public Instant getDate() {
		return date;
	}

	public void setDate(Instant date) {
		this.date = date;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	@Override
	public String toString() {
		return "Consult [date=" + date + ", price=" + price + ", patient=" + patient + "]";
	}

}
