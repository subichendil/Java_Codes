package oops;

class Animal_B{
	void sound() {
		System.out.println("Animal Sound");
	}
}

class Dog_B extends Animal_B{
	void bark() {
		System.out.println("Dog barks");
	}
}

class Cat_B extends Animal_B{
	void meow() {
		System.out.println("Cat meows");
	}
}

public class HierarchialInheritance {
public static void main(String[]args)
{
	Dog_B d=new Dog_B();
	Cat_B c=new Cat_B();
	
	d.sound();
	d.bark();
	c.sound();
	c.meow();
}
}
