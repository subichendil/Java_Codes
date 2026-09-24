package Handling;

public class eh_throw 
{
	static void checkAge(int age)
	{
		if(age<18)
		{
			throw new IllegalArgumentException("Age should be >=18");
		}
	}
	public static void main(String[]args)
	{
		checkAge(10);
	}
}
