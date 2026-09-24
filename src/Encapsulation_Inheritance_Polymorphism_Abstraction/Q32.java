package Encapsulation_Inheritance_Polymorphism_Abstraction;

class Shape
{
	void draw()
	{
		System.out.println("Drawing a shape");
	}
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("Drawing a circle"); 
	}
}

public class Q32 {
	public static void main(String[]args)
	{
		Circle c1=new Circle();
		c1.draw();
	}
}
