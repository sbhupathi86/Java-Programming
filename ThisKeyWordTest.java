
class ThisKeyWordTest_val
{
	int num1;
	int num2;
	int result;
	
	public void sum(int i, int j)
	{
		num1=i;
		num2=j;
		result = num1+num2;	
	}
	
	public void sub(int num1,int num2)
	{
		num1=num1;
		num2=num2;
		result=num1-num2;
		
		System.out.println(num1);
	}
	
	

}


public class ThisKeyWordTest
{
	public static void main(String[] args)
	{
		ThisKeyWordTest_val obj = new ThisKeyWordTest_val()	;
		obj.sum(4, 5);
//		System.out.println(obj.result);
		obj.sub(10, 10);
//		System.out.println(obj.result);
		
	}	
}
