
import java.util.*;
public class PalindromeUsingWhile 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		
		int original=n;
		int rev=0;
		
		while(n>0)
		{
			int digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		if(original==rev)
		{
			System.out.println("The number is a Palindrome");
		}
		else
		{
			System.out.println("The number is not a Palindrome");
		}
	}
}
