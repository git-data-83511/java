

/*Q1. Create a class called Invoice that a hardware store might use to represent an invoice for an item
sold at the store. An Invoice should include four pieces of information as fields—a part number
(type String), a part description (type String), a quantity of the item being purchased (type int) and a
price per item (double). Your class should have a constructor
that initializes the four instance variables. Provide a set and a get method for each instance variable.
calculates the invoice amount (i.e. multiplies the quantity by the price per item), then returns the
amount as a double value.
If the quantity is not positive, it should be set to 0.
If the price per item is not positive, it should be set to 0.0.
Write a test application named InvoiceTest that demonstrate class Invoice’s capabilities.*/
package com.sunbeam.invoice;
public class Invoice 
{
	 String pnumber;
	 String pdescription;
	 int quantity;
	 double price;
	 
	 public Invoice()
	 {
		 pnumber = "";
		 pdescription = "";
		 quantity = 0;
		 price = 0;
		 
	 }
	 public Invoice(String pnumber, String pdescription, int quantity, double price)
	 {
		 this.pnumber=pnumber;
		 this.pdescription=pdescription;
		 this.quantity=quantity;
		 this.price=price;
	 }
	 public void setPnumber(String pnumber)
	 {
		 this.pnumber=pnumber;
	 }
	 public String getPnumber()
	 {
		 return pnumber;
	 }
	 
	 public void setPdescription(String pdescription)
	 {
		 this.pdescription=pdescription;
	 }
	 public String getPdescription()
	 {
		 return pdescription;
	 }
	 
	 public void setQuantity(int quantity)
	 {
		 if (quantity > 0) 
		 {
	            this.quantity = quantity;
	     } 
		 else 
		 {
	            this.quantity = 0;
	     }
	 }
	 public int getQuantity()
	 {
		 return quantity;
	 }
	 
	 public void setPrice(int price)
	 {

		 if (price > 0) 
		 {
	            this.price = price;
	     } 
		 else 
		 {
	            this.price = 0;
	     }
	 }
	 public double getPrice()
	 {
		 return price;
	 }
	 
	 public double calculateInvoice()
	 {
		 return (quantity*price);
	 }
	 
	 
	
	
}
