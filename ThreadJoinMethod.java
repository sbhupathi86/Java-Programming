
public class ThreadJoinMethod extends Thread
{
	public void run()
	{
		for(int i = 1; i <=5; i ++)
		{
			try
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println("Error - Exception");
			}
		}
	}
	
	
	public static void main(String[] args)
	{
		//initiate
		ThreadJoinMethod t1 = new ThreadJoinMethod();
		ThreadJoinMethod t2= new ThreadJoinMethod();	
		ThreadJoinMethod t3 = new ThreadJoinMethod();
		
		t1.start();
//		try {
//			t1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		t2.start(); 
	}
	

}
