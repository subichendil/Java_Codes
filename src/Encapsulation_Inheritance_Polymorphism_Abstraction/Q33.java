package Encapsulation_Inheritance_Polymorphism_Abstraction;

class Payment
{
	void payment()
	{
		System.out.println("Making Payment");
	}
}

class GooglePay extends Payment
{
	void payment()
	{
		System.out.println("Payment made using GooglePay");
	}
}

class PhonePe extends Payment
{
	void payment()
	{
		System.out.println("Payment made using PhonePe");
	}
}

public class Q33 {
	public static void main(String[]args)
	{
		GooglePay g1=new GooglePay();
		g1.payment();
		PhonePe p1=new PhonePe();
		
		p1.payment();
	}
}
