package com.app.emp.salary;

import java.util.Scanner;

public class BasePlusCommissionEmployee extends CommissionEmployee
{
	private double basesalary;
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("----------Enter BasePlus Commission Emplyee Details----------");
		super.accept();
		System.out.print("Enter Base Salary : ");
		basesalary = sc.nextDouble();
	}
	public double calculateTotalSalary()
	{
		double sal;
		return sal = (getCommissionrate() * getGrosssale()) + basesalary;
	}
	public double calculateReward()
	{
		double reward;
		return reward = (getCommissionrate() * getGrosssale()) + (basesalary + basesalary*0.10);
	}
	public void display()
	{
		System.out.println("----------BasePlus Commission Employee Details----------");
		super.display();
		System.out.println("Base Salary - "+basesalary);
		System.out.println("Total Salary - "+calculateTotalSalary()+" Rs.");
	}
}
