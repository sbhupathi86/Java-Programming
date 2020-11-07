class A1
{
	public void show()
	{
		System.out.println("Show from Class A");
	}
}


class B1 extends A1
{
//	@override
	public void show()
	{
		super.show();
		System.out.println("Show from Class B");
		
	}
}


public class MethodOverRidingDemo
{

	public static void main(String[] args)
	{
		B1 obj1=new B1();
		obj1.show();
				
	}
}
