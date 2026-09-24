package Real_Time_OOPs_Ques;

class Vehicle
{
	String brand;
	double price;
	
	void displayVehicle()
	{
		System.out.println("Brand: "+brand);
		System.out.println("Price: "+price);
	}
}

class Car extends Vehicle
{
	String color;
	
	void bookCar()
	{
		System.out.println("Car booked.");
	}
}

public class Q47 
{
	public static void main(String[]args)
	{
		Car c1=new Car();
		c1.brand="Skoda";
		c1.price=400000;
		c1.color="Black";
		
		c1.displayVehicle();
		
		System.out.println("Color: "+c1.color);
		
		c1.bookCar();
	}
}
