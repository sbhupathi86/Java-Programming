//Final with Classes. 


final class Calcnew
{

	int result;
	
	public int sum(int i, int j)
	{
		return result = i+j ;
		
	}
}


class Calcadv 
{
	int result ;
	public int sub(int i, int j)
	{
		return result = i-j ;
	}
}

public class FinalClass
{
	
	public static void main(String[] args)
	{
//		Calcnew obj1 = new Calcnew();
//		System.out.println(obj1.sum(5, 5));
		
		
		Calcadv obj1 = new Calcadv();
		System.out.println(obj1.sub(1, 2));
		
	}
} 


