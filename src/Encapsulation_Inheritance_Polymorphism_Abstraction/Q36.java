package Encapsulation_Inheritance_Polymorphism_Abstraction;

abstract class Payment1
{
	abstract void makePayment();
}

class GPay extends Payment1
{
	void makePayment()
	{
		System.out.println("Payment made using GooglePay");
	}
}

public class Q36 
{
	public static void main(String[]args)
	{
		GPay g1=new GPay();
		g1.makePayment();
	}
}
