
public class ThreadNaming extends Thread
{
	public void run()
	{
		
		System.out.println("Running!!!");
		
	}
	
	public static void main(String[] args)
	{
		//initiate
		ThreadNaming t1 = new ThreadNaming();
		ThreadNaming t2 = new ThreadNaming();
		
		System.out.println("Name of t1:"+t1.getName()); 
		System.out.println("Name of t2:"+t2.getName());
		
		t1.run();
		t2.run();
		
		t1.setName("First Thread");
		t2.setName("Second Thread");

		System.out.println("Name of t1:"+t1.getName()); 
		System.out.println("Name of t2:"+t2.getName());
	}

}

