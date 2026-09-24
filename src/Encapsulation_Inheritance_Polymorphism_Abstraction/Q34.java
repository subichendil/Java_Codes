package Encapsulation_Inheritance_Polymorphism_Abstraction;

abstract class Vehicle1
{
	abstract void startEngine();
}

class Car1 extends Vehicle1
{
	void startEngine()
	{
		System.out.println("Car engine has started.");
	}
}

public class Q34 
{
	public static void main(String[]args)
	{
		Car1 c1=new Car1();
		c1.startEngine();
	}
}
