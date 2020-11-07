class ParentClass
{
	final  String testkw="Test KeyWord";
	public void displayMethod(String msg)
	{
		System.out.println("Calling Display Method in parent class "+msg);
	}
}


class SubClass extends ParentClass
{	
	String testkw= "test from subclass";
	@override
	public void displayMethod(String msg)
	{
		System.out.println("Calling Display Method in Child Class "+msg);
		super.displayMethod("yo");
		System.out.println(super.testkw);
		System.out.println(testkw);
	}

}


public class OverrideannotationDemo
{
	public static void main(String[] args)
	{
		//instantiate subclass
		SubClass obj= new SubClass();
		obj.displayMethod("Hello");
	}

}
