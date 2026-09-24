package Encapsulation_Inheritance_Polymorphism_Abstraction;

interface RBI
{
	void rateOfInterest();
}

class SBI implements RBI
{
	public void rateOfInterest()
	{
		System.out.println("Rate of interest is: 10%");
	}
}

public class Q38 
{
	public static void main(String[]args)
	{
		SBI s1=new SBI();
		s1.rateOfInterest();
	}
}
