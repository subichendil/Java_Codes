package Handling;

public class multiCatch 
{
	public static void main(String[]args)
	{
		try
		{
			int arr[]=new int [2];
			arr[1]=10;
			//arr[1]=10/0;
			//arr[2]=20;
			//arr[3]=30;
			System.out.println(arr);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic error");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index error");
		}
	}
}
