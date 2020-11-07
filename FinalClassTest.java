class vehicle
{
	public void maxspeed()
	{
		System.out.println("max speed is 100 mph");
	}
}


class car extends vehicle
{
	@override
	public void maxpseed()
	{
		System.out.println("Car speed is 200 mph");
	}
}



public class FinalClassTest 
{

	public static void main(String[] args)
	{
		car obj1 = new car();
		obj1.maxspeed();
	}
}


