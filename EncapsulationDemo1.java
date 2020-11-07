//Encapsulation is  a process to wrap code and data together into a single unit. 
//Make the data members of the class private. 
// use setter and getter methods to set and get values from private data members. 

class StudentEncap
{
	
	//private data members.
	private int rollno; 
	private String name;
	
	public int getRollno() 
	{
		return rollno;
	}
	public void setRollno(int rollno) 
	{
		this.rollno = rollno;
	}
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}	
	
}


public class EncapsulationDemo1 
{
	public static void main(String[] args)
	{
		//instantiate. 
		
		StudentEncap obj = new StudentEncap();
		obj.setRollno(98765);
		obj.setName("Srihari");
		System.out.println("Roll number is :"+obj.getRollno());
		System.out.println("Name is :"+obj.getName());
		
		
	}
}
