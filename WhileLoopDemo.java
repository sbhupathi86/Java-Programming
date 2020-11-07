class whileDemo
{
	
	void whileloop()
	{
	
	try
	{

		int i = 1 ;
	while (i<=5);
		{
			System.out.println(i);
			i = i + 1;
		}
	}
	
	catch(Exception e)
	{
		System.out.println("Exception error");
	}
	finally
	{
		System.out.println("Finally!!!");
	}
 }
}


public class WhileLoopDemo 
{
	public static void main(String[] args)
	{
		whileDemo w = new whileDemo();
		w.whileloop();
		
	}
}


