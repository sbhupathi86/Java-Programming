//Final keyworld would prevent a variable from getting changed. Final makes the variable a constant.

class bike
{
	final int maxspeed=100;
	void newspeed()
	{
		 maxspeed=200;
		 System.out.println(maxspeed);
	}
	
}


public class FinalVariableTest
{
	
	public static void main(String[] args)
	{
		bike obj1 = new bike();
		obj1.newspeed();
	}
}
