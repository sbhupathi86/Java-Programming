
class Emp
{
	int eid;
	int salary;
	static String ceo;
	
	static //Gets loaded once per class
	{
		ceo ="Peter Kern";
	}
	
	
	public Emp() //Default constructor - Gets called for every object. 
	{
		eid = 1;
		salary = 1000;	
	}

    public void show()
    {
    	System.out.println(eid+":"+salary+":"+ceo);
    }
	
	
	
}
public class StaticDemo 
{

	public static void main(String[] args)
	{
		Emp srihari=new Emp();
		srihari.eid=65999;
		srihari.salary=140000;
//		Emp.ceo;
		srihari.show();
		
		Emp Heman=new Emp();
		Heman.eid=65700;
		Heman.salary=9999;
//		Heman.ceo="PK";
		Heman.show();
		
	
	}

}
