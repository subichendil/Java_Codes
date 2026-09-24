package oops;

public class Car {
	
	String brand;
	int year;
	
	public Car()
	{
		this.brand="unknown";
		this.year=0;
		System.out.println("default constructor created with default values");
	}
	public Car(String brand, int year)
	{
		this.brand=brand;
		this.year=year;
		System.out.println("Parameterized constructor");
	}
	public void DisplayDetails()
	{
		System.out.println("Brand: "+ brand + " Year: "+ year);
	}
	public static void main(String[]args)
	{
		Car Car1=new Car();
		Car1.DisplayDetails();
 		Car Car2=new Car("Skoda",2003);
		Car2.DisplayDetails();
	}

}
