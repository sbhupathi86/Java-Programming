class calci1
{
	static void add(int i, int j)
	{
		System.out.println((i+j));
	}
	
	static void add(double i, double j)
	{
		System.out.println(i+j);
	}
	
	
//	static void add(number i, number j)
//	{
//		System.out.println(i + j);
//	}
}



public class MethodOverloadingChangingDataTypes 
{
	public static void main(String[] args)
	{
		calci1.add(1, 2);
		calci1.add(1.5, 1.5);
	}
}

