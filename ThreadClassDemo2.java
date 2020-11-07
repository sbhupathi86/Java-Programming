class ThreadDemo100 extends Thread
{
	public void run()
	{
		for(int i =1; i <=5; i++)
		{
			try
			{
				System.out.println(i);
				Thread.sleep(100);
			}
			catch(Exception e)
			{
				System.out.println("Error  Exception");
			}
		}
	}
}

public class ThreadClassDemo2 
{
	public static void main(String[] args)
	{
		//initiate
		ThreadDemo100 t1 = new ThreadDemo100();
		ThreadDemo100 t2 = new ThreadDemo100();
		t1.start();
		t2.start();
//		t1.run();
//		t2.run();
	}

}
