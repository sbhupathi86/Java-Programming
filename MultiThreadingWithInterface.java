//Multithreading with Interface - Runnable

class Hithere implements Runnable
{
	public void run()
	{
		for(int i =1; i<=5;i++);
		{
			System.out.println("Hi There");
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println("Error");
			}
		}
		
	}
}

class Hellothere implements Runnable
{
	public void run()
	{
		for(int i =1;i<=5; i++);
		{
			System.out.println("Hello There");
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println("Error");
			}
		}
	
	}
}

public class MultiThreadingWithInterface
{
	public static void main(String[] args)
	{
		//initiate
		Runnable obj1 = new Hithere();
		Runnable obj2 = new Hellothere();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.run();
		try
		{
			Thread.sleep(100);
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
		
		t2.run();
		
		
	}

}
