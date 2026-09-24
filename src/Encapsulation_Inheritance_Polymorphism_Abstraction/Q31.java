package Encapsulation_Inheritance_Polymorphism_Abstraction;

class Calculator
{
	int add(int a, int b)
	{
		return a+b;
	}
	int add(int a, int b, int c)
	{
		return a+b+c;
	}
	
	double add(double a, double b)
	{
		return a+b;
	}
}

public class Q31 {
	public static void main(String[]args)
	{
		Calculator c1=new Calculator();
		
		System.out.println("Addition of 2 numbers: "+c1.add(10,20));
		
		System.out.println("Addition of 3 numbers: "+c1.add(10, 20, 30));
		
		System.out.println("Addition of Decimal Numbers: "+c1.add(10.5, 12.5));
	}

}
