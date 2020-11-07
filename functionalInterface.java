//interface: Blue print for calls. 
//Methods in interfae are by default Public and abstract
// Constants in interface are by default public, static and final 


////create an interface
//interface Myinterface
//{
//	//create an abstract method
//	void display(); //no body for abstract method.
//}
//
////implementing interface
//
//class MyTestClass implements Myinterface
//{
//	//interface method should be used in the class.
//	public void display()
//	{
//		System.out.println("Calling inheritance method.");
//	}
//	
//	public void classMethod()
//	{
//		System.out.println("Calling class method");
//	}
//}


interface MyInterface
{
	void show();
}


public class functionalInterface
{

	public static void main(String[] args)
	{
		MyInterface obj1 = () -> System.out.println("Calling inheritance method.");
		obj1.show();
		
	}
}
