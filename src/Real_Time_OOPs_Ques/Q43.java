package Real_Time_OOPs_Ques;

class Student
{
	int studentId;
	String studentName;
	int marks;
	
	Student(int id, String name, int m)
	{
		studentId=id;
		studentName=name;
		marks=m;
	}
	
	void displayStudent()
	{
		System.out.println("Student ID: "+ studentId);
		System.out.println("Student Name: "+studentName);
		System.out.println("Marks: "+ marks);
	}
}

public class Q43 
{
	public static void main(String[]args)
	{
		Student s1=new Student(101,"Subi",85);
		s1.displayStudent();
	}
}
