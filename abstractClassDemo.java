abstract class Shape
{
	String color; 
	
	//abstract methods - methods with no bodies. 
	abstract double  area(); 
	public abstract String toString();
	
	
	// constructor. Abstract class can have a constructor. 
	
	public Shape(String color)
	{
		System.out.println("Shape constructor called");
		this.color= color ;
		System.out.println("Printing color from Shape constructor " + color);
	}
	

	// concrete method 
	
	public String getColor()
	{
		return color ;
	}

}


class Circle extends Shape
{
	double radius;
	// constructor 
	public Circle (String color, double radius)
	{
		super(color);
		System.out.println("Circle constructor called");
		this.radius = radius; 
	}
	
	double area()
	{
		return Math.PI*Math.pow(radius,2);
		
	}
	
	public String toString()
	{
		return ("Circle color is " + super.color +  " and area is : " + area()); 
	}
	
	
}


public class abstractClassDemo 
{
	public static void main(String[] args) 
    { 
        Shape s1 = new Circle("Red", 2.2); 
//        Shape s2 = new Rectangle("Yellow", 2, 4); 
          
        System.out.println(s1.toString()); 
//        System.out.println(s2.toString()); 
    }
}
