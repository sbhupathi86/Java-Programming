//interface

interface MyInterface
{
	void a(); //public  and abstract method
	
	void b(); //
	
}

class MyclassNew implements MyInterface
{
	
	public void a()
	{
		System.out.println("Method - a from MyclassNew");
	}
//	
//	public void b()
//	{
//		System.out.println("Method -d from MyclassNew");
//	}
}


public class interfaceTest 
{
	public static void main(String[] args)
	{
		//initialize
		MyclassNew obj = new MyclassNew();
		obj.a();
		obj.b();
	}

}
