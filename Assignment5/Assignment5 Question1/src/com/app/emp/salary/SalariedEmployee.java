package com.app.emp.salary;

import java.util.Scanner;

public class SalariedEmployee extends Employee
{
	private double weeklySalary;
	
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("----------Enter Salaried Employee Details----------");
		super.accept();
		System.out.print("Enter Weekly Salary : ");
		weeklySalary = sc.nextDouble();
	}
	public double calculateTotalSalary()
	{
		return weeklySalary;
	}
	
	public void display()
	{
		System.out.println("----------Salaried Employee Details----------");
		super.display();
		System.out.println("Weekly Salary - "+calculateTotalSalary()+" Rs.");
	}
}
