package com.app.emp.salary;

import java.util.Scanner;

public abstract class Employee 
{
	String fname;
	String lname;
	int ssn;
	abstract double calculateTotalSalary();
	
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Name : ");
		fname = sc.nextLine();
		System.out.print("Enter Last Name : ");
		lname = sc.nextLine();
		System.out.print("Enter Social Security Number (SSN) : ");
		ssn = sc.nextInt();	
	}
	
	public void display()
	{
		System.out.println("Employee Name - "+fname+" "+lname);
		System.out.println("Social Security Number - "+ssn);
	}

}
