package Constructors_PracticeQuestions;

class Student
{
	int stuID;
	String stuName;
	
	Student()
	{
		stuID=1;
		stuName="Subi";
	}
}
public class MainStudent 
{
	public static void main (String[]args)
	{
		Student s1=new Student();
		
		System.out.println("Student ID: "+s1.stuID);
		System.out.println("Student Name: "+s1.stuName);
	}
}
