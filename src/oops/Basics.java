package oops;

public class Basics /*class*/{
	String name; /* instance variables*/
	int age; /* instance variables*/
	
	public static void main(String[]args) {
		Basics s1=new Basics();/* s1-obj & new Basics is the obj created*/
		s1.name="Shrey";
		s1.age=23;
		
		System.out.println("Name: "+ s1.name);
		System.out.println("Age: "+ s1.age);
	}

}
