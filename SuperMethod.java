class AnimalTest
{
	String color="Black" ;
	void eat()
	{
		System.out.println("Eating - from Animal class");
	}
}


class DogTest extends AnimalTest
{
	String color = "White";
	void sleep()
	{
		System.out.println("Sleeping - from Dog Class");
		System.out.println(super.color);
		super.eat();
	}
}
public class SuperMethod 
{
	public static void main(String[] args)
	{
		DogTest d = new DogTest();
		d.sleep();
	}

}
