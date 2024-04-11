package com.sunbeam;

public class ExceptionLineTooLong extends Exception {

	public ExceptionLineTooLong()
	{

	}
	
@Override
public void printStackTrace() 
{
	System.out.println("The string is too long......");
}
}