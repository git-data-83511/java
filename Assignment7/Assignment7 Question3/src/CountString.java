

import java.util.Scanner;

public class CountString {

			public static void main(String[] args) {
				String name;
				
				Scanner sc =new Scanner(System.in);
				System.out.print("ENTER THE STRING  = " );
				name=sc.nextLine();
				
				String s1=name;
				s1.trim();
				
				String arr[]=s1.split(" ");
					for(String element:arr)
					System.out.println("STRING  = "+element );
				System.out.println("STRING LENGTH = "+s1.length() );

		     sc.close();
			}
			
		
	}

