class AnimalTest
{
	String color = "White"; 
}

class DogTest extends AnimalTest
{
	String color = "Black";
	void printcolor()
	{
		
		System.out.println(color);
		System.out.println(super.color);
	}
	
}

public class Supervariable 
{
	public static void main(String[] args)
	{
		DogTest d = new DogTest();
		d.printcolor();
	}

}
