package Encapsulation_Inheritance_Polymorphism_Abstraction;

class Person
{
	String name;
	int age;
	
	void displayPerson() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
}

class Student1 extends Person{
	int studentId;
	
	void displayStudent1()
	{
		System.out.println("Student ID: "+studentId);
	}
}

public class Q29 {

	public static void main(String[]args)
	{
		Student1 s1=new Student1();
		s1.name="subi";
		s1.age=23;
		s1.studentId=110;
		
		s1.displayPerson();
		s1.displayStudent1();
	}
}
