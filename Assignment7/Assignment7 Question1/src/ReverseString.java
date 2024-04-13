

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		String name;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter a string:");
		name = sc.next();
		
		String a = name;
		
		StringBuilder s1 = new StringBuilder(name);
		
		System.out.println("Original String: " + a);
		
		System.out.println("Reversed String: " + s1.reverse());
		
		sc.close();

	}

}