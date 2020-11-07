class casio
{
	public void add(int i, int j)
	{
		System.out.println(i+j);
	}
	public void add(int i, int j, int k)
	{
		System.out.println(i+j+k);
	}
	
	public void add(double i, double j)
	{
		System.out.println(i+j);
	}
}


public class MethodOverLoading 
{
	public static void main(String[] args)
	{
		casio obj = new casio();
		obj.add(1,2);
		obj.add(1,2,3);
		obj.add(2.5,2.5);
	}
}
