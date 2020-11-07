class Account
{
	int accno;
	String name;
	float amount;
	
	//Welcome method
	public void welcome(String name, int accno )
	{
		System.out.println("Welcome "+name+" (accno): "+accno);
		
	}
	
	//method to initialize object
	public void insert(int accno, String name,float amt)
	{
		this.accno=accno;
		this.name=name;
		this.amount=amt;
	}
	
	public void deposit(float amt)
	{
		this.amount=this.amount+amt;
		System.out.println("Deposited amount: "+amount);
		
	}
	
	public void withdrawl(float amt)
	{
		
		if (amount < amt)
		{
			System.out.println("Insufficient balance");
			
		}
		else
		{
			amount = amount - amt;
			System.out.println("New balance is: "+ amount);
		}
	}
	
	public void balancecheck(int accno)
	{
		if (this.accno !=accno)
				{
					System.out.println("Account "+ accno+" doesnt exist");
				}
		else
		{
			System.out.println("Balance for accno "+accno+ " is "+ amount);
		}
		
	}
	
	
	
	
	
}



public class Bankaccount
{

	public static void main(String[] args)
	{
		//initialize an object through reference
		Account sri=new Account();
		sri.welcome("Srhari",9999);
		
		sri.insert(9999,"Srihari",1000);
		sri.balancecheck(9999);
		sri.deposit(1000);
		sri.withdrawl(9000);
		
//		
        Account heman = new Account();
 		heman.balancecheck(9876);
 		heman.withdrawl(1000);
		
		
		
	}
}
