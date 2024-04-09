package com.app.emp.salary;

import java.util.Scanner;

public class HourlyEmployee extends Employee
{
	private double hourlywages;
	private int hoursworked;
	
	public double getHourlywages() {
		return hourlywages;
	}

	public void setHourlywages(double hourlywages) {
		this.hourlywages = hourlywages;
	}

	public int getHoursworked() {
		return hoursworked;
	}

	public void setHoursworked(int hoursworked) {
		this.hoursworked = hoursworked;
	}

	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("----------Enter Hourly Employee Details----------");
		super.accept();
		System.out.print("Enter Hourly Wages : ");
		hourlywages = sc.nextDouble();
		System.out.print("Enter Hours Worked : ");
		hoursworked = sc.nextInt();
	}
	
	public double calculateTotalSalary()
	{
		double sal=0;
		if(hoursworked <= 40)
		{
			sal = hoursworked*hourlywages;
		}
		else if(hoursworked > 40)
		{
			sal = (40 * hourlywages) + (hoursworked - 40) * hourlywages *1.5;
		}
		return sal;	
	}
	
	public void display()
	{
		System.out.println("----------Hourly Employee Details----------");
		super.display();
		System.out.println("Hourly Wages - "+hourlywages);
		System.out.println("Hours Worked - "+hoursworked);
		System.out.println("Total Salary - "+calculateTotalSalary()+" Rs.");
	}
}
