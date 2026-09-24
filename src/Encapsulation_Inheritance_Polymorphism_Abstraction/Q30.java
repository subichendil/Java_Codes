package Encapsulation_Inheritance_Polymorphism_Abstraction;

class Vehicle
{
	String brand;
	
	void displayBrand()
	{
		System.out.println("Brand: "+brand);
	}
}

class Car extends Vehicle
{
	String color;
	
	void displayCar()
	{
		System.out.println("Color: "+color);
	}
}

public class Q30 {
	public static void main(String[]args)
	{
		Car c1=new Car();
		
		c1.brand="Skoda";
		c1.color="White";
		
		c1.displayBrand();
		c1.displayCar();
	}
}
