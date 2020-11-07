class A
{
	public  A()
	{
		System.out.println("Default constructor of A");
	}
	
	
	public A(int i)
	{	
		super();
		System.out.println("Parameterized constructor of A");
	}
}

class B extends A
{
	public B()
	{
		System.out.println("Default constructor or B");
	}
	
	public B(int j)
	{
		super(j);
		System.out.println("Parameterized Constructor of B");
	}
}



public class SuperMethodDemo
{
	public static void main(String[] args)
	{
//		A obj1=new A();
		B obj2=new B();
	}
}
