import java.util.Scanner;

public class objectdemo1 
{
	public static void main(String[] args)
	{
		Scanner keyboard=new Scanner(System.in);
		System.out.println("What is your name? ");
		String name=keyboard.next();
		System.out.println("hello "+ name.toUpperCase());
			
	}

}
