
public class ExceptionHandling2 
{
	//multiple catch try blocks
	public static void main(String[] args)
	{
		try
		{
			//create an array
			int array[] = new int[5];
			//access an element
			System.out.println(array[4]);
			
			//Create an arithmatic error
			int i = 10;
			int j = 0;
			int k = i/j;
		}
		catch(ArithmeticException g)
		{
			System.out.println("Divide by zero is not allowed");
		}
		catch(ArrayIndexOutOfBoundsException f)
		{
			System.out.println("Out of limit - error: Be in the limit");
		}
		
		catch(Exception e)
		{
			System.out.println("out of limit array error");
		}
		finally
		{
			System.out.println("Exiting the program");
		}
		
		
	}
}
