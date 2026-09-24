package Encapsulation_Inheritance_Polymorphism_Abstraction;

class Student{
	private int studentId;
	private String studentName;
	
	public void setStudentId(int id)
	{
		studentId=id;	
	}	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentName(String name)
	{
		studentName=name;
	}
	public String getStudentName() {
		return studentName;
	}
}

public class Q26 {
	public static void main(String[]args)
	{
		Student s1=new Student();
		s1.setStudentId(1);
		s1.setStudentName("Subi");
		
		System.out.println("ID: "+s1.getStudentId());
		System.out.println("Name: "+s1.getStudentName());
	}

}
