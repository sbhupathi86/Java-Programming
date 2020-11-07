class BankRate
{
	static int intRate = 99;
	
	int intRate()
	{
		return 0;
	}
	
}

class SBIndia extends BankRate
{
	int intRate()
	{
		return 5;
	}
}

class ICIC extends BankRate
{
	int intRate()
	{
		return 7;
	}
}



public class MethodOverrideDemo 
{
	public static void main(String[] args)
	{
		//initiate the object
		SBIndia s = new SBIndia();
		ICIC i = new ICIC();
		
		System.out.println("SBI interest rate is "+s.intRate());
		System.out.println("Icici interest rate is "+i.intRate());
		
//		System.out.println(intRate());
	}
}
