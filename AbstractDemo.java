//a method that doesnot have a body is known as abstract method.
abstract class Human
{
	public void eat()
	{
		
	}
	
	public void sleep()
	{
		
	}
	
}

class Men extends Human
{
	public void height()
	{
		
	}
	
}

public class AbstractDemo
{
	public static void main(String[] args)
	{
		Men obj1= new Men();
		obj1.eat();
	}
}


