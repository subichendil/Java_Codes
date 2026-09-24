package Encapsulation_Inheritance_Polymorphism_Abstraction;

abstract class Employee1
{
	abstract void calculateSalary();
}

class FTEmployee extends Employee1
{
	void calculateSalary()
	{
		System.out.println("Full Time Slalary: 50000");
	}
}

public class Q35 
{
	public static void main(String[]args)
	{
		FTEmployee e1=new FTEmployee();
		e1.calculateSalary();
	}
}
