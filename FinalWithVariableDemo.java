//Final when used with Variables makes them constants
// Final when used with Classes makes them non extendable
//Final when used with Methods prevents them from overwriding.


class FinalVariable
{
	final int DAY=0;
	public void Days()
	{
//		DAY=1;
		System.out.println(DAY);
	}
}

public class FinalWithVariableDemo 
{
	public static void main(String[] args)
	{
		FinalVariable obj1 = new FinalVariable();
		obj1.Days();
	}
	
}
