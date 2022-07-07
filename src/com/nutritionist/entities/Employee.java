package com.nutritionist.entities;

public class Employee {

	private String name;
	private String function;
	private Double salary;

	public Employee() {
	}

	public Employee(String name, String function, Double salary) {
		this.name = name;
		this.function = function;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", function=" + function + ", salary=" + salary + "]";
	}

}
