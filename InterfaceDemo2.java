//Interface is a blue print for class.
//Methods in Interface are abstract - no body
//Interface describes the behavior. 
// all the constants in interface are by default public static final. 
// all the methods in interface are by default public and abstract

import java.io.*; 
interface MyVehicle
{
	//Define abstract methods.
	
	void changeGear(int a);
	void speedUp(int a);
	void applyBreaks(int a);
	
}


//Create Bicycle Class. 

class Bicycle implements MyVehicle
{
	int speed ;
	int gear;
	
	//to change gear
	
	public void changeGear(int newGear)
	{
		gear = newGear;
		
	}
	
	//to change speed
	public void speedUp(int newSpeed)
	{
		speed  = newSpeed ;
	}
	
	//to decrease speed
	public void applyBreaks(int decrement)
	{
		speed = speed - decrement ;
	}
	
	public void printStates() 
	{ 
        System.out.println("speed: " + speed  + " gear: " + gear); 
	}
}


//create BikeClass

class Bike implements MyVehicle
{
	//define constants
	int speed;
	int gear ;
	
	
	//to change gear
	public void changeGear(int newGear)
	{
		gear = newGear ;
	}
	
	public void speedUp(int newSpeed)
	{
		speed = newSpeed;
	}
	
	public void applyBreaks(int decrement)
	{
		speed = speed - decrement;
	}
	
	public void printStates()
	{ 
        System.out.println("speed: " + speed  + " gear: " + gear); 
	}
	
}

public class InterfaceDemo2 
{
	public static void main(String[] args)
	{
		Bicycle bc = new Bicycle();
		bc.changeGear(2);
		bc.speedUp(50);
		bc.applyBreaks(20); 
		bc.printStates();
	
	}

}
