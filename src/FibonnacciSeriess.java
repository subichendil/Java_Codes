
import java.util.*;
public class FibonnacciSeriess {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter n: ");
	int n=sc.nextInt();
	int FirstTerm=0;
	int SecondTerm=1;
	System.out.println("Fibonnaci Series: ");
	
	for(int i=1;i<=n;i++) 
	{
		System.out.println(FirstTerm);
		
		int nextTerm=FirstTerm+SecondTerm;
		FirstTerm=SecondTerm;
		SecondTerm=nextTerm;
	}
	}
}
