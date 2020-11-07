import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo
{
	public static void main(String[] args)
	{
		Set<Integer> myset = new TreeSet();
		myset.add(100);
		myset.add(200);
		myset.add(300);
		myset.add(150);
//		myset.add("two");
		myset.add(150);
		myset.add(87);
		
		System.out.println(myset);
		
	}

}
