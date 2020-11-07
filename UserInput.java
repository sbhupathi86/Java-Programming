import java.util.Scanner;

class Welcomestmt//class
{
	String a ;
	//cosntructor
	public  Welcomestmt(int a)
	{
		System.out.println("welcome stmt classa");
	}
	
	public  Welcomestmt()
	{
		System.out.println("default constructor");
	}

 
}



public class UserInput 
{

	public static void main(String[] args)
	{
		
		Welcomestmt obj= new Welcomestmt();
		
		
		Welcomestmt obj1 = new Welcomestmt(5);
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your Name: ");
		String a = sc.next();
		System.out.println("Welcome "+ a);
		sc.close();
		
	}
//	in.close();
}
