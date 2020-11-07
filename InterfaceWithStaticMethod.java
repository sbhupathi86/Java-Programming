
interface DemoTest
{
	//all the methods in interface are abstract 
	
	void displayMethod() ; // abstract method which doesn't have any body
	
	//define a default method. 
	
	default void defaultMethod()
	{
		System.out.println("Default method in Interface");
	}
	
	
	static void staticMethod()
	{
		System.out.println("Static method in Interface");
	}

}

//We can call a static method of an interface without creating an object.

public class InterfaceWithStaticMethod 
{
	public static void main(String[] args)
	{
		DemoTest.staticMethod();
	}

}




