package com.sunbeam;

import java.util.Scanner;



public class StringLength 
{

  public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string: ");
		String s = sc.nextLine();

		try
		{
			
			int length = s.length();
			
			if(length>80)
			{
				System.out.println("String length is: " + length);
				throw new ExceptionLineTooLong();
			}
			else 
			{
                System.out.println("String length is: " + length);
            }
        } 
		
		catch (ExceptionLineTooLong e) 
		{ 
            e.printStackTrace();
        }
		
		finally 
		{
			System.out.println("Inside Finally block");
			sc.close();
		}
        System.out.println("Program executed succesfully.....");
				
		}
	}