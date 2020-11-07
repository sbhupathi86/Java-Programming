
package interface ; 
interface BankInterest
{
	int intRate(); //abstract method final
	
	default void offerRate()
	{
		System.out.println("Dussera offer rate - 10%");
	}
}

class SBIBank implements BankInterest
{
	public int intRate()
	{
		return 5;
	}
	
	public void offerRate()
	{
		System.out.println("Dussera Bumper offer rate - 15%");
	
	}
	
	
}

public class InterfaceTest2 
{
	public static void main(String[] args)
	{
		SBIBank b = new SBIBank();
		System.out.println(b.intRate());
		b.offerRate();
		
	}
	
}


