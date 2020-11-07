import java.util.Scanner;
//import java.util.*;

public class OneDimArrayTest 
{

	public static void main(String[] args)
	{
		int myArray[]= {1,2,3,4};
		int i;
		int j;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value for i:");
		i=sc.nextInt();
	
		System.out.print("Enter value of j:");
		j=sc.nextInt();
		
		System.out.println("Value for i and j are "+i+","+j+" respectively");
		
		System.out.println(myArray[i]);
	}
	
}
