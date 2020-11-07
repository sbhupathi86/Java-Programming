class clubmembership
{
	String fn;
	String ln;
    static int membership=0; 
	
	public  clubmembership(String fn, String ln)
	{
		fn=fn;
		ln=ln;
		membership=membership+1 ;
		System.out.println("Constructor for "+fn+" ,"+ln+", members: "+membership);
	}
	
	
}


public class StaticVariableExample 
{
	public static void main(String[] args)
	{
		//instantiate
		clubmembership m1=new clubmembership("Kajal","Agarwarl");
		clubmembership m2=new clubmembership("Anuhska","shetty");
	}
}



