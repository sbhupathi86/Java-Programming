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


public class SingleInheritance 
{
	public static void main(String[] args)
	{
		Dog obj1=new Dog();
		obj1.bark();
		obj1.eat();
		
	}
}


