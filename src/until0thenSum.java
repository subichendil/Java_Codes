
import java.util.*;
public class until0thenSum 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		int sum=0;
		
		while(n!=0)
		{
			sum=sum+n;
			n=sc.nextInt();
		}
		System.out.println("Total sum= "+sum);
	}
}
