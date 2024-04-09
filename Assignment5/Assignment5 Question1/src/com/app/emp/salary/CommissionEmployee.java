package com.app.emp.salary;

import java.util.Scanner;

public class CommissionEmployee extends Employee {
	private double grosssale;
	private double commissionrate;

	public double getGrosssale() {
		return grosssale;
	}

	public void setGrosssale(double grosssale) {
		this.grosssale = grosssale;
	}

	public double getCommissionrate() {
		return commissionrate;
	}

	public void setCommissionrate(double commissionrate) {
		this.commissionrate = commissionrate;
	}

	public void accept() {
		

		System.out.println("----------Enter Commission Employee Details----------");
		Scanner sc = new Scanner(System.in);
		super.accept();
		System.out.print("Enter Gross Sale : ");
		grosssale = sc.nextDouble();
		System.out.print("Enter Commission Rate : ");
		commissionrate = sc.nextDouble();
	}

	public double calculateTotalSalary() {
		double sal;
		return sal = commissionrate * grosssale;
	}

	public void display() {
		System.out.println("----------Commission Employee Details----------");
		super.display();
		System.out.println("Gross Sale - " + grosssale);
		System.out.println("Commission Rate - " + commissionrate);
		System.out.println("Total Salary - " + calculateTotalSalary() + " Rs.");
	}
}
