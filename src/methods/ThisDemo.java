package methods;

class Student{
	int id;
	String Sname;
	
	Student(int id, String Sname)
	{
		this.id=id;
		this .Sname=Sname;
	}
	void display() {
		System.out.println(id+ " - "+ Sname);
	}
}

public class ThisDemo {
public static void maim(String[]args)
{
	Student s1=new Student(1, "Sam");
	Student s2=new Student(2,"Shreyas");
	s1.display();
	s2.display();
}
}
