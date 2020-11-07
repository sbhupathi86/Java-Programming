class BikeClass
{
	void run()
	{
		System.out.println("Parent class BikeClass");
	}
	
	//data member
	int speed = 100 ;
}

class Splendor extends BikeClass
{
	void run()
	{
		System.out.println("Subclass - Splendor");
	}
	
	//data member
	int speed = 200;
}



public class RunTimePolyMorphismDemo 
{
	public static void main(String[] args)
	{
		//instantiate
		BikeClass b = new Splendor();
		b.run();	
		System.out.println(b.speed);
	}

}
