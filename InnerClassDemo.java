class OuterClass
{
	int a ;
	public void show()
	{
		System.out.println("in show");
	}
	
	class inner
	{
		public void display()
		{
			System.out.println("in display");
		}
	}
	
}



public class InnerClassDemo
{

	public static void main(String[] args)
	{
		OuterClass obj= new OuterClass(); // Accessing outer class
		obj.show() ;
		
		OuterClass.inner obj1= obj.new inner();
		obj1.display();
		
		
	}

}

