package Encapsulation_Inheritance_Polymorphism_Abstraction;

interface Payment2
{
	void makePayment();
}

class Gpay1 implements Payment2
{
	public void makePayment()
	{
		System.out.println("Payment made using Google Pay");
	}
}

class PhonePe1 implements Payment2
{
	public void makePayment()
	{
		System.out.println("Payment made using PhonePe");
	}
}

class Paytm implements Payment2
{
	public void makePayment()
	{
		System.out.println("Payment made using Paytm");
	}
}

public class Q40 
{
	public static void main(String[]args)
	{
		Gpay1 g1=new Gpay1();
		PhonePe1 p1=new PhonePe1();
		Paytm p2=new Paytm();
		
		g1.makePayment();
		p1.makePayment();
		p2.makePayment();
	}
}
