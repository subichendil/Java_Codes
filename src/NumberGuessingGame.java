
import java.util.*;
public class NumberGuessingGame {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	int n=7;
	int guess;
	
	do
	{
		System.out.println("Guess the number: ");
		guess=sc.nextInt();
		
		if(guess<n)
		{
			System.out.println("Low!");
		}
		else if(guess>n)
		{
			System.out.println("High!");
		}
		else
		{
			System.out.println("Correct guess");
		}
	}while(guess!=n);
}
}
