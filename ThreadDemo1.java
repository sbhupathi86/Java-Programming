class Multi extends Thread
{
	public void run()
	{	
		int i = 1;
		while(i<= 5);
		{
			System.out.println(i);
			i=i+1;
		}
		
	}
	
}

public class ThreadDemo1 
{
	public static void main(String[] args)
	{
		//initiate
		Multi m = new Multi();
		m.start();
	}

} 

