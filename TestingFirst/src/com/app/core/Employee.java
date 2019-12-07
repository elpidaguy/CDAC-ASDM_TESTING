package com.app.core;

import java.time.LocalDate;

public class Employee {

	private String Id;
	private String name;
	private double basic_salary;
	private String department;
	private String reporting_authority, designation;
	private LocalDate date_of_joining;

	private int TA=10000,DA=5000,HRA=5000;
	
	public Employee() {
		System.out.println("Employee CTOR Called");
	}

	public void setId(String id) {
		String reg = "^ID[0-9]{5}$";
		if (id.length() <= 7 && id.matches(reg)) {
			Id = id;
		} else {
			Id = null;
		}
	}

	public String getId() {
		return Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name.equals(""))
		{
			this.name = "Invalid";
		}
		else
		{
			this.name = name;
		}
	}

	public double getBasic_salary() {
		return basic_salary;
	}

	public void setBasic_salary(double basic_salary) {
		if(basic_salary > 0)
		{
			this.basic_salary = basic_salary+TA+DA+HRA;
		}
	}
	
	public double calcSalary(double basic_salary) {
		if(basic_salary > 0)
		{
			this.basic_salary = basic_salary+TA+DA+HRA;
		}
		
		return this.basic_salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		
		if(department.equals(""))
		{
			this.department = "Invalid";
		}
		else
		{
			this.department = department;
		}
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", basic_salary=" + basic_salary + ", department=" + department
				+ ", reporting_authority=" + reporting_authority + ", designation=" + designation + ", date_of_joining="
				+ date_of_joining + "]";
	}

}
