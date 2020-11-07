

public class ExceptionHandling 
{
	public static void main(String[] args)
	{
		//demo for exception handling,  try/catch/finall
		
		try
		{
			int i = 6;
			int j = 0;
			int k= i/j; 
		}
		catch(Exception e)
		{
			System.out.println("divide by zero error");
			System.err.println("Divide by zero error - in Red");
		}
		
		finally
		{
			System.out.println("Executing the finally step");
		}
		
	}

}


