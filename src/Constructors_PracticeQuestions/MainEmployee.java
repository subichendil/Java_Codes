package Constructors_PracticeQuestions;

class Employee
{
	int empID;
	String empName;
	double salary;
	
	Employee(int id, String Name, double sal)
	{
		empID=id;
		empName=Name;
		salary=sal;
	}
}

public class MainEmployee 
{
	public static void main(String[]args)
	{
		Employee e1=new Employee(100,"Priyanka", 40000);
		
		System.out.println("Employee ID: "+ e1.empID);
		System.out.println("Employee Name: "+ e1.empName);
		System.out.println("Salary: "+e1.salary);
	}
}
