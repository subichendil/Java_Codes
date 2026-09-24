package Constructors_PracticeQuestions;

class Mobile
{
	String brand;
	String model;
	double price;
	
	Mobile()
	{
		brand="Samsung";
		model="Galaxy";
		price=40000;
	}
	
	Mobile(String b, String m,double p)
	{
		brand=b;
		model=m;
		price=p;
	}
}
public class MainMobile 
{
	public static void main(String[]args)
	{
		Mobile m1=new Mobile();
		System.out.println("Mobile 1 Details: ");
		System.out.println("Brand: "+ m1.brand);
		System.out.println("Model: "+m1.model);
		System.out.println("Price: "+m1.price);
		
		System.out.println();
		
		Mobile m2=new Mobile("Apple","iPhone15", 60000);
		System.out.println("Mobile 2 Details: ");
		System.out.println("Brand: "+m2.brand);
		System.out.println("Model: "+m2.model);
		System.out.println("Price: "+m2.price);
	}
}
