//
//class AnimalDemo
//{
//	String color = "White";
//}
//
//class DogDemo extends AnimalDemo
//{
//	String color = "Black";
//	void display()
//	{
//		System.out.println("Sub class color "+ color);
//		System.out.println("Super class color"+ super.color);
//	}
//	
//}
//
//
//public class SuperKWDemo
//{
//	public static void main(String[] args)
//	{
//		//instantiate
//		DogDemo a = new DogDemo();
//		a.display();
//	}
//}


//Super KW to call parent class method.

class AnimalDemo
{
	String color = "4 legs"; 
	
	void eat()
	{
		System.out.println("call from parent class - Eating");
	}
}

class DogDemo extends AnimalDemo
{
	//define a method with out any return
	
	void eat()
	{
		System.out.println("Eating bread.....");
	}
	
	void bark()
	{
		System.out.println("Barking ......");
	}	
	
	void superclass()
	{
		super.eat();
	}
	
}


public class SuperKWDemo
{
	
	public static void main(String[] args)
	{
		DogDemo d = new DogDemo();
		d.eat();
		d.bark();
		d.superclass();
		
	}
}
