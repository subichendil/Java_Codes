package methods;

class Animal_E
{
	public void makeSound()
	{
		System.out.println("Makes sound");
	}
}

class Dog_E extends Animal_E
{
	public void makeSound()
	{
		System.out.println("The Dog barks");
	}
}

class Cat_E extends Animal_E
{
	public void makeSound()
	{
		System.out.println("The cat makes sound");
	}
}

public class Runtime_Polymorphism 
{
	public static void main(String[]args)
	{
		Animal_E newAnimal= new Animal_E();
		Animal_E newDog= new Dog_E();
		Animal_E newCat=new Cat_E();
		
		newAnimal.makeSound();
		newDog.makeSound();
		newCat.makeSound();
	}
}
