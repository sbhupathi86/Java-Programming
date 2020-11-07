class Behavior
{
	final public void sleep()
	{
		System.out.println("I am sleeping");
	}
	
	public void eat()
	{
		System.out.println("I am eating");
	}
}

class Activity extends Behavior
{
//	public void sleep()
//	{
//		System.out.println("I am sleeping - activity class");
//	}
}



public class FinalWithMethods
{
	public static void main(String[] args)
	{
		Activity obj1 = new Activity();
		obj1.sleep();
	}
}
