class Animal
{
	public void eat()
	{
		System.out.println("eating");
	}
}

class Dog extends Animal
{
	public void bark()
	{
		System.out.println("barking");
	}
}

class Babydog extends Dog
{
	public void weep()
	{
		System.out.println("weeping");
	}
}


public class Multipleinheritance 
{
	public static void main(String[] args)
	{
		Babydog obj1=new Babydog();
		obj1.bark();
		obj1.eat();
		obj1.weep();
		
	}
}


