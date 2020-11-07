//Static keyword is used for memory managemebt

class students
{
	int rollno ;
	String name;
	String collname ="IFET";
	
	public students(int rollno, String name)
	{
		this.rollno=rollno;
		this.name=name;
		System.out.println(rollno+"|"+name+"|"+collname);
		
	}
}

public class StaticKWDemo 
{
	public static void main(String args[])
	{
		//Initiate objects
		students  obj1 = new students(1001,"Srihari") ;		
	}

}


