package ClassesAndObjects_PracticeQuestions;

class Mobile
{
	String brand;
	String Model;
	double price;
}

public class MobileClassQ3 
{
	public static void main(String[]args)
	{
		Mobile m1=new Mobile();
		m1.brand="Samsung";
		m1.Model="Galaxy S24";
		m1.price=50000;
		
		System.out.println("Brand: "+m1.brand);
		System.out.println("Model: "+m1.Model);
		System.out.println("Price: "+m1.price);
	}
}
