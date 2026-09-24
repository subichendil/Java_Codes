package Encapsulation_Inheritance_Polymorphism_Abstraction;

interface Animal
{
	void eat();
}

interface Bird
{
	void fly();
}

class Parrot implements Animal,Bird
{
	public void eat()
	{
		System.out.println("Parrot eats fruits");
	}
	
	public void fly()
	{
		System.out.println("Parrot can fly");
	}
}

public class Q39 
{
	public static void main(String[]args)
	{
		Parrot p1=new Parrot();
		
		p1.eat();
		p1.fly();
	}
}
