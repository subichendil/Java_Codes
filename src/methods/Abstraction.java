package methods;

abstract class Animal_D
{
	public abstract void makeSound();
	
	public void eat() {
		System.out.println("It eats");
	}
}

class Dog_D extends Animal_D{
	public void makeSound() {
		System.out.println("barks");
	}
}

public class Abstraction {
	public static void main(String[]args) {
		Animal_D myDog=new Dog_D();
		myDog.makeSound();
		myDog.eat();
	}
}
