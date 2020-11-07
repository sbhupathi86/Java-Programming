class vehicle
{
	final void maxspeed()
	{
		System.out.println("max speed is 100 mph");
	}
}


class car extends vehicle
{
	void maxpseed()
	{
		System.out.println("Car speed is 200 mph");
	}
}



public class FinalMethodTest 
{

	public static void main(String[] args)
	{
		car obj1 = new car();
		obj1.maxspeed();
	}
}
