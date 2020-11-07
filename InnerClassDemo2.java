class OuterClass2
{
	int i ;  //variable
	public void show() //Member Method
	{
		System.out.println("In show - OuterClass");
	}
	
	class InnerClass2
	{
		public void display()
		{
			System.out.println("in Display - Inner Class");
		}
	}
}

public class InnerClassDemo2
{

	public static void main(String[] args) 
	{
		// Instantiate an object for outer class.
		OuterClass2 obj= new OuterClass2();
		obj.show();
		
		//Instantiate an object for Inner class.
		OuterClass2.InnerClass2 obj1= obj.new InnerClass2();
		obj1.display();
		
	}
	
	

}
