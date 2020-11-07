class Calculator
{
	public int add(int i,int j)
	{
		return i+j;
	}
}

class CalcAdv extends Calculator
{
	public int sub(int i, int j)
	{
		return i-j;
	}
}

class CalcVeryAdv extends CalcAdv
{
	public int mul(int i, int j)
	{
		return i*j;
	}
}


public class InheritanceDemo 
{

	public static void main(String[] args)
	{
//		Calculator c1= new Calculator();
//		System.out.println(c1.add(2,3));

//		CalcAdv c2 = new CalcAdv();
//		System.out.println(c2.sub(5, 5));
		
//		CalcAdv c2= new CalcAdv();
//		System.out.println(c2.add(2, 3));
//		System.out.println(c2.sub(5, 5));	
		
		 CalcVeryAdv c3 = new CalcVeryAdv();
		 System.out.println(c3.add(2, 3));
		 System.out.println(c3.sub(5,5));
		 System.out.println(c3.mul(2, 3));		
		
	}
	
}
