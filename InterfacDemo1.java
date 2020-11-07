//Interface methods are by default abstract (methods with no body but just signature). Interface is like a blueprint for class.
//by default, variables in interfaces are public static final.  
// a class that implements an interface should use all the methods of the interface. 

import java.io.*; 

interface In1
{
	int a = 10 ; //by default, constants are public static final . 
	
	void display();  //  By default, methods in interface are public and abstract ( no body )
	
}




public class InterfacDemo1  implements In1
{

	//Implement the method of interface.
	
	public void display()
	{
		System.out.println("Implementing method from Interface");
	}
	
	//Driver code
	
	public  static void main(String[] args)
	{
		InterfacDemo1 obj1 = new InterfacDemo1();
		obj1.display();
		
		
	}
}


