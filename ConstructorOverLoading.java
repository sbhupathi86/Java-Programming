class Casio2
{
	int i; 
	int j;
	
	public Casio2() // Default constructor
	{
		System.out.println("This is default constructor");
		
	}
	
	public Casio2(int num1)
	{
		System.out.println(num1);
		
	}
}


public class ConstructorOverLoading 
{
	public static void main(String[] args)
	{
		Casio2 obj=new Casio2();
		obj.i=10;
		obj.j=20;
		
		Casio2 obj1= new Casio2(5);
		obj1.i=1;
		obj1.j=2;
		
	}

}
