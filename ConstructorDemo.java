

class ConstructorDemoClass 
{
	int num1;
	int num2;
	int result;
	
	public void add()
	{
		result = num1+num2;
	}
	
	public void sub()
	{
		result = num1-num2;
	}
	
	public ConstructorDemoClass(int i)
	{
		this.num1=i;
		this.num2=i;
		System.out.println("test");
	}

	public ConstructorDemoClass() 
	{
		System.out.println("const without input variable");
	}
	
}

public class ConstructorDemo
{
	public static void main(String[] args)
	{
		ConstructorDemoClass obj = new ConstructorDemoClass();
		obj.num1=10;
		obj.num2=10;
		obj.add();
		System.out.println(obj.result);
		obj.sub();
		System.out.println(obj.result);
		ConstructorDemoClass obj1 = new ConstructorDemoClass(10);
		obj1.add();
		System.out.println(obj1.result);
		
					
	}
	
	public int  Multiply(int i, int j)
	{
		return i*j;
		
	}
	
	
	
}

