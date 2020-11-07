//class calculator1
//{
//	public void add(int i, int j)
//	{
//		System.out.println(i+j);
//	}
//	
//	public void add(int i, int j , int k)
//	{
//		System.out.println(i+j+k);
//	}
//}
//
//
//public class MethodOverloadingChangingArgs 
//{
//	public static void main(String args[])
//	
//	{
//		calculator1 obj1=new calculator1();
//		obj1.add(1,2);
//		obj1.add(1, 2,3);
//	}
//}




class calci
{
	static void add(int i, int j)
	{
		System.out.println(i+j);
	}
	
	static void add(int i,int j, int k)
	{
		System.out.println(i+j+k);
	}
}


public class MethodOverloadingChangingArgs 
{
	public static void main(String args[])
	{
		calci.add(1,2);
		calci.add(1,2,3); 
		
	}
	
	
}

