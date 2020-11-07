interface MyInterface
{
	void MethodTest(); //abstract method
	
	default public void show()   //Defined a method. 
	{
		System.out.println("MyInterface - show");
	}
}

class Myclass implements MyInterface
{
	public void MethodTest()
	{
		System.out.println("Calling Abstract method from MyInteface");
	}
//	
//	public void show()
//	{
//		System.out.println("Myclass - show");
//	}
}



public class InterfaceDefaultMethod 
{
	public static void main(String[] args)
	{
		MyInterface obj = new Myclass();
		obj.MethodTest();
//		obj.show();
	}
}
