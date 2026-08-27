
import java.util.*;
public class ReverseOfNumber {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a num to reverse: ");
	int n=sc.nextInt();
	int rev=0;
	for(int i = n; n!=0;n=n/10) 
	{
		int digit=n%10;
		rev=rev*10+digit;
	}
	System.out.println(rev);
	}
}
