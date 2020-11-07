
abstract class Maths
{
	public abstract int sumoftwo(int i, int j);

	
	public abstract int sumofthree(int i , int j , int k);

	
	public void print()
	{
		System.out.println("Print from sum class");
	}
	
}

class Demo extends Maths
{
	
	public int sumoftwo(int i, int j)
	{
		return i+j;
	}
	
	public int sumofthree(int i , int j, int k)
	{
		return i+j+k;
	}
	
	public void printDemo()
	{
		System.out.println("print from Demo class");
	}
}



public class AbstractClassMethod
{
	public static void main(String[] args)
	{
		//instantiate the class with an object
		Demo D = new Demo();
		System.out.println(D.sumoftwo(1, 2));
		System.out.println(D.sumofthree(1,2,3));
	}

}
