package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LibraryMgtSystem {

	public static void main(String[] args) 
	{
		Set<Books> s = new HashSet<> ();
		
		Scanner sc = new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("========LIBRARY MANAGEMENT SYSTEM========");
			System.out.println("1. Add Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Sort Books by Category and Display");
            System.out.println("4. Sort Books by Author and Display");
            System.out.println("5. Find Book by ISBN");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            
            switch(choice)
            {
            case 1 : 
            {
            	System.out.println("=======Enter Book Details========");
                System.out.print("ISBN: ");
                String isbn = sc.nextLine();
                
                System.out.print("Price: ");
                double prize = sc.nextDouble();
                
                sc.nextLine(); 
                System.out.print("Author Name: ");
                String author_name = sc.nextLine();
                
                System.out.print("Quantity: ");
                int qty = sc.nextInt();
                sc.nextLine();
                System.out.print("Category (FICTION, BIOPIC, SELFHELP, MYSTERY, ADVENTURE): ");
                Category category = Category.valueOf(sc.nextLine().toUpperCase());
                
                Books book = new Books(isbn, prize, author_name, qty, category);
                s.add(book);
                System.out.println("Book added successfully!");
            }
            break;	
            
            case 2 : 
            {
            	if (s.isEmpty()) 
            	{
                    System.out.println("No books are available in library.");
                } 
            	else 
            	{
                    System.out.println("All Books are available in Library:");
                    for (Books book : s) 
                    {
                        System.out.println(book);
                    }
                }
            }
            break;	
            
            case 3 : 
            {
            	if (s.isEmpty()) 
            	{
                    System.out.println("No books available in the library.");
                } 
            	else 
            	{
                    ArrayList<Books> sortedBooks = new ArrayList<>(s);
                    System.out.println("=========Sorting on books category=========");

            		class CatComparator implements Comparator<Books> //using comparator interface for category
            		{  
            			
						@Override
						public int compare(Books o1, Books o2) 
						{
							return o1.getCategory().compareTo(o2.getCategory());
					    }
            		}
                    Comparator<Books> CategoryComparator = new CatComparator();
            		Collections.sort(sortedBooks, CategoryComparator);

            		for (Books book : sortedBooks)
            			System.out.println(book);

                }
            }
            break;	
            
            case 4 : 
            {
            	if (s.isEmpty()) 
            	{
                    System.out.println("No books available in the library.");
                } 
            	else 
            	{
                    ArrayList<Books> sortedBooks = new ArrayList<>(s);
                    System.out.println("=========Sorting on books Author name=========");

            		class AuthComparator implements Comparator<Books> //using comparator interface for name 
            		{  
            			
						@Override
						public int compare(Books o1, Books o2) 
						{
							return o1.getAuthor_name().compareTo(o2.getAuthor_name());
					    }
            		}
                    Comparator<Books> AuthnameComparator = new AuthComparator();
            		Collections.sort(sortedBooks, AuthnameComparator);

            		for (Books book : sortedBooks)
            			System.out.println(book);

                }
            }
            break;	
            
            case 5 : 
            {
            	System.out.print("Enter your book ISBN: ");
                String isbn = sc.nextLine();
                for(Books book : s)
                {
                	if(book.getIsbn().equals(isbn))
                	{
                		System.out.println("Book found.....");
                		System.out.println(book);
                	}
                }
                System.out.println("Book not found........");
            }
            break;	
            
            case 6 : 
            {
            	System.out.println("Thank you for using app..........");
            }
            break;	
            
            default:
            	System.out.println("Invalid choice..........................");
            }
		}while(choice!=0);
	}

}
