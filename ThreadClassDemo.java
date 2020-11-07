
//public class ThreadClassDemo extends Thread
//{
//	public void  run()
//	{
//		System.out.println("Running!!!");
//	}
//	
//	public static void main(String[] args)
//	{
//		//initiate
//		ThreadClassDemo t = new ThreadClassDemo();
//		t.run();
//	}
//
//}


class ThreadDemo extends Thread
{
	public void run()
	{
		System.out.println("run method");
	}
	
	public void test()
	{
		for(int i =1; i <=5; i++) 
		{
			try
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println("Error!!!");
			}
		}
	}
	
}

public class ThreadClassDemo
{
	public static void main(String[] args)
	{
		//initiate
		ThreadDemo t = new ThreadDemo();
		t.start();
		t.test();
	}
	
}