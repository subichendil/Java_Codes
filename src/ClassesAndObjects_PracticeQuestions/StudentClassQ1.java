package ClassesAndObjects_PracticeQuestions;


class Student
{
	int stuID;
	String stuName;
}

public class StudentClassQ1 
{
	public static void main(String[]args)
	{
		Student s1=new Student();
		s1.stuID=100;
		s1.stuName="Shreyas";
		System.out.println("Student ID: "+s1.stuID);
		System.out.println("Student Name: "+s1.stuName);		
		}

}
