
/*
Class is the blue print for an object. We define variables and methods in the class.
*/


//class calc 
//{
//
//	int num1;
//	int num2;
//	int result;
//	
//	public void perform()
//	{
//		result = num1 + num2;
//	}
//}
//
///*
// * object : 
// */
//
//public class ObjectDemo
//{
//	public static void main(String[] args)
//	{
//		calc obj = new calc();
//		obj.num1=3;
//		obj.num2=5;
//		obj.perform();
//		System.out.println(obj.result);
//	}
//}
//

//class calc
//{
//	int num1 ;
//	int num2 ;
//	int result ;
//	
//	public void add()
//	{
//		result = num1 + num2 ;
//	}
//	
//	public void sub()
//	{
//		result = num1 - num2 ;
//	}
//	
//	public calc(int i, int j)
//	{
//		this.num1=i;
//		this.num2=j;
//		System.out.println("div test - parameterized constructor");
//	}
//	
//	public calc()
//	{
//		
//	}
//}

public class ObjectDemo
{
	public static void main(String[] args)
	{
		
//		calc obj=new calc(5,10);
//		obj.num1=5;
//		obj.num2=10;
		int num1=5;
		int num2=10;
		
//		obj.add();
		System.out.println(num1+num2);
		
//		obj.sub();
		System.out.println(num1-num2);
		
	}	
}

