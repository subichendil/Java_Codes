package Real_Time_OOPs_Ques;

class Employee
{
	 int empId;
	 String empName;
	 double salary;
	  
	Employee()
	{
		
	}
	void calculateSalary()
	{
		System.out.println("Salary: "+salary);
	}
}

class Manager extends Employee
{
	double bonus;
	
	Manager(int id, String name, double sal, double b)
	{
		empId=id;
		empName=name;
		salary=sal;
		bonus=b;
	}
	void calculateSalary()
	{
		System.out.println("Total: "+(salary+bonus));
	}
}

public class Q50 
{
	public static void main(String[]args)
	{
		Manager m1=new Manager(101,"Subi",50000,10000);
		System.out.println("Emp id: "+m1.empId);
		System.out.println("Emp Name: "+m1.empName);
		m1.calculateSalary();
	}
	
}
