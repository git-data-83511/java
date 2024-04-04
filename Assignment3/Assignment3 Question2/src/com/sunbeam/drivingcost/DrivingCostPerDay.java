package com.sunbeam.drivingcost;

import java.util.Scanner;

class DrivingDetails 
{

	private int totalmiles;
	private int pricepergallon;
	private int avgmilespergallon;
	private int parkingfeeperday;
	private int tollsperday;
	
	
	
    public void accept()
    {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter total miles per day : ");
		totalmiles = sc.nextInt();
		
		System.out.print("enter price per gallon : ");
		pricepergallon = sc.nextInt();
		
		System.out.print("enter average miles per gallon : ");
		avgmilespergallon = sc.nextInt();
		
		System.out.print("enter parking fees per day : ");
		parkingfeeperday = sc.nextInt();
		
		System.out.print("enter total tolls per day : ");
		tollsperday = sc.nextInt();
	}
    
    public void calculatetotalcostperday()
    {
	  double totalbill=this.parkingfeeperday+this.tollsperday+(this.totalmiles/this.avgmilespergallon)*this.pricepergallon;
	  System.out.println("Total bill per day is : RS."+totalbill);
	}
    
    
    
}
public class DrivingCostPerDay
{

	public static void main(String[] args)
	{
		DrivingDetails d = new DrivingDetails();
		d.accept();
		d.calculatetotalcostperday();

	}

}

