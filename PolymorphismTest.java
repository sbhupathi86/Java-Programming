
class Bank
{
	  float getRateOfInterest()
	 {
		 return 0;
	 }
}

class SBI extends Bank
{
	float getRateOfInterest()
	{
		return 4.5f; 
	}
}

class ICICI extends Bank
{
	float getRateOfInterest()
	{
		return 0.9f; 
	}
}

public class PolymorphismTest 
{
	public static void main(String[] args)
	{
		Bank b = new SBI();
		System.out.println("SBI interest rate "+  b.getRateOfInterest());
		Bank c = new ICICI();
		System.out.println("ICICI interest rate "+ c.getRateOfInterest() );
		Bank d = new Bank();
		System.out.println("Bank Class "+ d.getRateOfInterest());
		
	}
}
