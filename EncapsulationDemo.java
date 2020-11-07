// Encapsulation -> binding data with methods.

class Student
{
	private int rollno;
	private String name;
	
	public void setrollno(int rnum)
	{
		this.rollno = rnum;
	}
	
	public int getrollno()
	{
		return rollno;
	}
	
	public void setname(String name)
	{
		this.name = name;
	}
	
	public String getname()
	{
		return name;
	}
	
	public void show()
	{
		System.out.println(rollno);
		System.out.println(name);
	} 
//	
//	public void 
	
	
	
}




public class EncapsulationDemo 
{
	public static void main(String[] args)
	{
		Student obj1 = new Student();
		obj1.setrollno(2);
		obj1.setname("srihari");
		System.out.println(obj1.getrollno());
		System.out.println(obj1.getname());
		
		
	}
}
