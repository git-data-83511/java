

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String name;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter a string:");
		name = sc.next();
		
		String a = name;
		
		StringBuilder s1 = new StringBuilder(name);
		
		System.out.println("Original String: " + a);
		
		System.out.println("Reversed String: " + s1.reverse());
		
		
		if(a.equals(s1.toString())) {
			System.out.print("String is a Palindrome");
		}else {
			System.out.print("String is not a Palindrome");
		}
		sc.close();
	}

}