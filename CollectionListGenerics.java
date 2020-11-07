import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//public class CollectionListGenerics
//{
//	public static void main(String[] args)
//	{
//		List myval = new ArrayList();
//		myval.add(10);
//		myval.add(20);
//		myval.add(1, "two");
//		
//		Iterator it = myval.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
//		
//	}
//
//}



public class CollectionListGenerics
{
	public static void main(String[] args)
	{
		List<Integer> myval = new ArrayList<>();
		myval.add(10);
		myval.add(20);
//		myval.add(1, "two");
		
//		Iterator it = myval.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
		
		
		for(Integer o: myval)
		{
			System.out.println(o);
		}
		
	}

}
