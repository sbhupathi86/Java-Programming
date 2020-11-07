
class Welcome
{
	public void display()
	{
		System.out.println("Welcome");
	}
}

//class Intro
//{
//	public void display()
//	{
//		System.out.println("Welcomne from Intro class");
//	}
//}


public class AnonymousClass 
{
	public static void main(String[] args)
	{
		Welcome obj1 = new Welcome()
				{
					public void display()
					{
						System.out.println("Welcome from anonymous class");
					}
				} ;
		obj1.display();
//		obj1.display();
		
	}
}


