import java.util.Comparator;
import java.util.Scanner;

public class GenericSort 
{
	static <T> void selectionSort(T [] arr, Comparator<T> c)
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j = i+1; j<arr.length; j++)
			{
				if(c.compare(arr[i], arr[j])>0)
				{
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) 
	{
		int size;
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter Size of Array : ");
		size = sc.nextInt();
		Double[] arr = new Double[size];
		System.out.println("Enter Array Elements :- ");
		for (int i=0;i<size;i++)
		{
			System.out.print("Enter elemet at arr["+i+"] :");
			arr[i] = sc.nextDouble();
		}
		System.out.println("Array Elements Before Sorting : ");
		for(double element: arr)
		{
			System.out.println(element);
		}
		
		class Dcomparator implements Comparator<Double>
		{

			@Override
			public int compare(Double o1, Double o2) 
			{
				int value = Double.compare(o1,o2);
				return value;
			}
			
		}
		Dcomparator d = new Dcomparator();
		GenericSort.selectionSort(arr, d);
		
		
		System.out.println("Array Elements After Sortion : ");
		for(double sort: arr)
		{
			System.out.println(sort);
		}

	}

}
