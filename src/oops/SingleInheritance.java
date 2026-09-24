package oops;

class Animal
{
	void sound()
	{
		System.out.println("Sound of the animal");
	}
}
	class Rabbit extends Animal
	{
		void grunt()
		{
			System.out.println("Rabbit grunts");
		}
	}

public class SingleInheritance {
public static void main(String[]args) {
	Rabbit r=new Rabbit();
	r.sound();
	r.grunt();
}
}
