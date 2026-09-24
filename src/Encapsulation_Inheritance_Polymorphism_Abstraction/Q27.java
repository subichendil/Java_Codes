package Encapsulation_Inheritance_Polymorphism_Abstraction;

class Employee
{
	private int employeeId;
	private String employeeName;
	private double salary;
	
	public void setEmployeeId(int id)
	{
		employeeId=id;
	}
	public int getEmployeeId()
	{
		return employeeId;
	}
	public void setEmployeName(String name) 
	{
		employeeName=name;
	}
	public String getEmployeeName()
	{
		return employeeName;
	}
	public void setSalary(double sal)
	{
		salary=sal;
	}
	public double getSalary()
	{
		return salary;
	}
}

public class Q27 {

	public static void main(String[]args)
	{
		Employee e1=new Employee();
		
		e1.setEmployeeId(1);
		e1.setEmployeName("Rahul");
		e1.setSalary(40000);
		
		System.out.println("ID: "+e1.getEmployeeId());
		System.out.println("Name: "+e1.getEmployeeName());
		System.out.println("Salary: "+e1.getSalary());
	}
}
