package com.sunbeam.tester;

import com.sunbeam.invoice.Invoice;

public class InvoiceTester 
{

	public static void main(String[] args) 
	{
		Invoice i = new Invoice("101","SCREW DRIVER",10,200);
		System.out.println("PART NUMBER - " + i.getPnumber());
		System.out.println("PART DESCRIPTION - " + i.getPdescription());
		System.out.println("QUANTITY - " + i.getQuantity());
		System.out.println("PRICE - " + i.getPrice());
		System.out.println("TOTAL AMOUNT = " + i.calculateInvoice());
		
	}

}
