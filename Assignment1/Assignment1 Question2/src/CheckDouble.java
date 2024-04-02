import java.util.Scanner;

public class CheckDouble 
{

	public static void main(String[] args) 
	{

		double num1 = 0,num2=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER VALUE FOR NUM1 : ");
		if(sc.hasNextDouble())
		{
			num1 = sc.nextDouble();
		}
		
		else
		{
			System.out.println("Invalid arguments, only double values are allowed...");
			System.exit(0);
		}
		
		System.out.print("ENTER VALUE FOR NUM2 : ");
		if(sc.hasNextDouble())
		{
			num2 = sc.nextDouble();
		}
		
		else
		{
			System.out.println("Invalid arguments, only double values are allowed...");
			System.exit(0);
		}
		
		System.out.println("Average = "+(num1+num2)/2);
				
	}

}
