package oops;
class Animal_C{
	void eat() {
		System.out.println("Animal eats");
	}
}

class dog_A extends Animal_C{
	void bark() {
		System.out.println("Dog barks");
	}
}

class puppy extends dog_A{
	void weeps()
	{
		System.out.println("Puppy weeps");
	}
}

public class Multi_level_Inheritance {
public static void main(String[]args)
{
	puppy p=new puppy();
	p.eat();
	p.bark();
	p.weeps();
}
}
