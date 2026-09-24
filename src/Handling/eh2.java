package Handling;

public class eh2 
{
	public static void main(String[]args)
	{
		try
		{
			int a=2/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("can't divide by zero");
		}
		finally 
		{
			System.out.println("Always execute");
		}
	}
}
