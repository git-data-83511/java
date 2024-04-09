package com.app.emp.tester;
import java.util.Scanner;
import com.app.emp.salary.*;

public class CalEmpSal 
{
	public static void main(String [] args)
	{
		int choice;
		Employee e = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Salaried Employee");
		System.out.println("2. Hourly Employee");
		System.out.println("3. Commission Employee");
		System.out.println("4. BasePlus Commission Employee");
		System.out.println("Which Type of Employee Salary Calculation need to be done");
		System.out.print("Enter Your Choice : ");
		choice = sc.nextInt();
		
		if(choice == 1)
		{
			e = new SalariedEmployee();
			e.accept();
			e.display();
		}
		else if(choice == 2)
		{
			e = new HourlyEmployee();
			e.accept();
			e.display();
		}
		else if(choice == 3)
		{
			e = new CommissionEmployee();
			e.accept();
			e.display();
		}
		else if(choice == 4)
		{
			e = new BasePlusCommissionEmployee();
			BasePlusCommissionEmployee b = null;
			if(e instanceof BasePlusCommissionEmployee)
			{
				b = (BasePlusCommissionEmployee)e;
				b.accept();
				b.display();
				System.out.println("By adding 10% Reward Total Salary - "+b.calculateReward()+" Rs.");
			}
			else
			{
				e.accept();
				e.display();
			}
		}
		else
		{
			System.out.println("Enter Proper Choice ....");
		}
	}
}
