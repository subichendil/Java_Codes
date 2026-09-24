package ClassesAndObjects_PracticeQuestions;

class Car
{
	String brand;
	String color;
	double price;
}

public class CarClass 
{
	public static void main(String[]args)
	{
		Car c1=new Car();
		
		c1.brand="Skoda";
		c1.color="Blue";
		c1.price=450000;
		
		System.out.println("Brand: "+c1.brand);
		System.out.println("Color: "+c1.color);
		System.out.println("Price: "+c1.price);
	}
}
