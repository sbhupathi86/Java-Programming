class  CollegeInfo
{
	//define static data members
	static String collname = "IFET"; 
	
	//non static data members
	String studentname;
	int rollno;
	
	//Static method to access static data member
	
	static void change()
	{
		System.out.println("Static data member is "+ collname);
		collname="JNTU";
		System.out.println("new updated collname is "+ collname);
	}
	
	//constructor
	CollegeInfo(String studentname,int rollno)
	{
		this.studentname=studentname;
		this.rollno=rollno;
	}
	
	void display()
	{
		System.out.println(studentname+" "+rollno+" "+collname);
	}
	
}

public class StaticKWMethodDemo
{
	public static void main(String[] args)
	{
		//access static method
		CollegeInfo.change();
		
		//create objects
		CollegeInfo  s1 = new CollegeInfo("Srihari",1001);
		CollegeInfo  s2 = new CollegeInfo("hemanth",1002);
		s1.display();
		s2.display();
		
	}
}
