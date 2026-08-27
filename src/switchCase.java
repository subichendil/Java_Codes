
import java.util.Scanner;
public class switchCase {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a: ");
		int a=sc.nextInt();
		System.out.println("Enter b: ");
		int b=sc.nextInt();
		System.out.println("Enter the operation: ");
		int result= sc.nextInt();
		
		
		switch(result)
		{
		case 1:
	
			System.out.println("Addition: " + (a+b));
			break;
		
		case 2:
			System.out.println("Subtraction: " +(a-b));
			break;
		case 3:
			System.out.println("Multiplication: " + (a*b));
			break;
		case 4:
			System.out.println("Division: "+ (a/b));
			break;
		case 5:
			System.out.println("remainder: " + (a%b));
			break;
		}
	}

}
