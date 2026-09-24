package ClassesAndObjects_PracticeQuestions;

class Employee
{
	int empID;
	String empName;
	double salary;
}

public class EmployeeClassQ2 
{
	public static void main(String[]args)
	{
		Employee e1=new Employee();
		e1.empID=100;
		e1.empName="Keshva";
		e1.salary=45000;
		
		Employee e2=new Employee();
		e2.empID=200;
		e2.empName="Diya";
		e2.salary=45000;
		
		System.out.println("Employee 1 Details: ");
		System.out.println("Employee ID: "+ e1.empID);
		System.out.println("Employee Name: "+ e1.empName);
		System.out.println("Employee Salary: "+ e1.salary);
		
		System.out.println("Employee 2 Details: ");
		System.out.println("Employee ID: "+ e2.empID);
		System.out.println("Employee Name: "+ e2.empName);
		System.out.println("Employee Salary: "+ e2.salary);
	}
}
