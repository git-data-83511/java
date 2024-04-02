import java.util.Scanner;

public class NumberConversion 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num;
		
			System.out.print("ENTER A INTEGER NUMBER : ");
			num = sc.nextInt();
		
		
			System.out.println("GIVEN INTEGER NUMBER - "+num);
			System.out.println("BINARY EQUIVALENT - "+Integer.toBinaryString(num));
			System.out.println("OCTAL EQUIVALENT - "+Integer.toOctalString(num));
			System.out.println("HEXADECIMAL EQUIVALENT - "+Integer.toHexString(num));
		
	}
	

}
