import java.util.Scanner;

public class TwoDimArrayTest
{

	public static void main(String[] args)
	{
		//Define a two dim array
		int myArray[][]= 
			{
					{1,2,3,4},
					{5,6,7,8}
			};
		
		//Scanner to read data from user input
		
		int i;
		int j ;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value for i:");
		i=sc.nextInt();
		System.out.print("Enter value for j:");
		j=sc.nextInt();
		System.out.println(myArray[i][j]);
			
	
	}
	
}
