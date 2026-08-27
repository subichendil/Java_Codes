
import java.util.Scanner;
public class PrimeOrNot {
public static void main(String[]args)
{
	int i,count=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the num");
	int number=sc.nextInt();
	
	for(i=2; i<=number/2; i++) 
	{
		if(number%i==0) {
			count++;
			break;
		}
	}
	if(count==0 && number!=1)
	{
		System.out.println("prime");
	}
	else
	{
		System.out.println("Not prime");
	}
}
}
