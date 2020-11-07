//interface Language
//{
//	void getName(String name);  //abstract method
//}
//
//class ProgrammingLanguage implements Language
//{
//	public void getName(String name)
//	{
//		System.out.println("Programming language: "+ name);
//	}
//	
//}
//
//
//public class InterfaceTesting 
//{
//	public static void main(String[] args)
//	{
//		//implement
//		Language l = new ProgrammingLanguage();
//		l.getName("Java");
//	}
//
//}


interface Polygon
{
	//define an abstract method - method with no body
	void getArea(int len, int brd);
}

class Rectangle implements Polygon
{
	//implement method.
	public void getArea(int len, int brd)
	{
		System.out.println("Area of rectangle is: "+(len*brd));
	}
}

public class InterfaceTesting 
{
	public static void main(String[] args)
	{
		//initiate the method.
		Rectangle a = new Rectangle();
		a.getArea(5, 5);
	}
}