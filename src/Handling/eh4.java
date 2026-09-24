package Handling;

public class eh4 
{
	public static void main(String[]args)
	{
		int[]numbers= {1,2,3,9,0};
		try
		{
			System.out.println(numbers[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exceptionn caught");
		}
		finally
		{
			System.out.println("executes");
		}
		System.out.println(numbers);
	}
}
