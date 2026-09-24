package methods;

import java.util.Scanner;

/*Same Name, Different Data type*/
public class overloading {
	void add(int a, int b)
	{
		System.out.println("Sum of 2 numbers: "+(a+b));
	}
	void add(int a, int b, int c)
	{
		System.out.println("Sum of 3 numbers: "+(a+b+c));
	}
	void add(double a,double b)
	{
		System.out.println("Sum of double: "+(a+b));
	}
	void add(String a, String b)
	{
		System.out.println("Name: "+ a + " " + b);
	}

	public static void main(String[]args)
	{
		overloading obj=new overloading();
		obj.add(10, 20);
		obj.add(10, 20, 30);
		obj.add(10.5, 20.5);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st name: ");
		String a=sc.next();
		System.out.println("Enter 2nd name: ");
		String b=sc.next();
		obj.add(a,b);
		
	}
}
