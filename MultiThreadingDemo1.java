//multi threading.


class Hi extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++);
				{
					System.out.println("Hi");
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


class Hello extends Thread
{
	public void run()
	{
		for(int i = 1; i<=5;i++)
		{
			System.out.println("Hello");
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

public class MultiThreadingDemo1 
{
	
	public static void main(String[] args)
	{
	//initiate
	Hi obj1  = new Hi();
	Hello obj2 = new Hello();
	
	//starting the threads
	obj1.start();
	try
	{
		Thread.sleep(10);
	}
	catch(Exception e)
	{
		System.out.println("Error");
	}
	obj2.start();
	
	
	obj1.run();
	obj2.run();
	}
}