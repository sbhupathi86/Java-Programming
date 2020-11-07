import java.util.Scanner;

public class UserInputUsingScanner
{
	public static void main(String[] args)
	{
//		read input from Scanner
		int n =0; 
		System.out.println("Enter your value: ");
		try
		{
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
			System.out.println("Value of n is:"+ n);
		}
		catch(Exception e)
		{
			System.out.println("error from catch clause");
		}
	}
}

