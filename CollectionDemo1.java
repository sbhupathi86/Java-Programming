import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//public class CollectionDemo1
//{
//	public static void main(String[] args)
//	{
//		Collection myval = new ArrayList();
//		myval.add(5);
//		myval.add(10);
//		myval.add(15); 
//		
//		System.out.println(myval);
//		
////		for( int i =1; i <= myval.size(); i++)
////		{
////			System.out.println(myval(i));
////		}
//		
//		Iterator it = myval.iterator();
// 		for(int i =1; i <= myval.size(); i++)
//		{
//			System.out.println(it(i));
//		}
//		
//		
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
//	
//		
//	}
//	
//}


public class CollectionDemo1
{
	public static void main(String[] args)
	{
		ArrayList myval = new ArrayList();
		myval.add(10);
		
		myval.add(20);
		myval.add(1, 15);
		myval.add("two");
		
		Iterator it = myval.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
}

