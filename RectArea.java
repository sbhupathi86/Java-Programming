//Class and Object example

class RectangleArea
{
	//instance variable 
	int len;
	int wid ;
	
	void insert( int len , int wid)
	{
		this.len = len ;
		this.wid = wid;
	}
	
	
	void display()
	{
		System.out.println("Area of rectangle is "+(this.len * this.wid));
	}
	
}


public class RectArea 
{
	public static void main(String[] args)
	{
		//create object
		
		RectangleArea a1 = new RectangleArea();
		a1.insert(10, 10);
		a1.display();
		
	}
	
	

}
