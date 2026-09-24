package Handling;

public class eh3 
{
	public static void main(String[]args)
	{
		int a=10;
		int b=2;
		try
		{
			int res=a/b;
			System.out.println(res);
		}
		catch(ArithmeticException e)
		{
			System.out.println("error");
		}
	}
}
