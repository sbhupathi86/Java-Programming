
//Initialization through variables.

//class StudentTest
//{
//	int id;
//	String name;
//}
//
//public class Initializationdemo 
//{
//	public static void main(String[] args)
//	{
//		StudentTest s1 = new StudentTest();
//		s1.name = "Srihari";
//		s1.id = 1001 ;	
//		System.out.println(s1.id+" "+s1.name);
//	}
//}


//class StudentTest
//{
//	//instance variables
//	int id;
//	String name;
//	
//	//methods
//	
//	void insertRecord(int id, String name)
//	{
//		this.id = id ;
//		this.name = name;
//	}
//	
//	void displayInfo() 
//	{
//		System.out.println(this.id+ " "+this.name);
//	}
//}
//
//// Initialization through methods
//public class Initializationdemo
//{
//	public static void main(String[] args)
//	{
//		
//		StudentTest s1 = new StudentTest();
//		StudentTest s2 = new StudentTest();
//		s1.insertRecord(1001,"Srihari");
//		s2.insertRecord(1002,"Hemanth");
//		s1.displayInfo();
//		s2.displayInfo();
//	}
//}

 
//Initialization through constructor

class StudentTest
{
	//instance variables
	int id;
	String name;
	
	void insert(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	void display()
	{
		System.out.println(this.id+" "+this.name);
	}
	
}


public class Initializationdemo
{
	public static void main(String[] args)
	{
		//createing objects
		
		StudentTest s1 = new StudentTest();
		s1.insert(1001,"Srihari");
		s1.display();
		
	}
	
}


