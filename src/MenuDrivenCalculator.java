
import java.util.*;
public class MenuDrivenCalculator 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		
		double n1, n2;
		int choice;
		do
		{
			System.out.println("1 denotes Addition");
			System.out.println("2 denotes Subtraction");
			System.out.println("3 denotes Multiplication");
			System.out.println("5 denotes division");
			System.out.println("4 denotes Modulus");
			System.out.println("6 denotes exit");
			
			System.out.println("Enter your choice: ");
			choice=sc.nextInt();
			
			System.out.println("Enter first number: ");
			n1=sc.nextDouble();
			System.out.println("Enter second number: ");
			n2=sc.nextDouble();
			
			switch(choice)
			{
			case 1:
				System.out.println(n1+n2);
				break;
			case 2:
				System.out.println(n1-n2);
				break;
			case 3:
				System.out.println(n1*n2);
				break;
			case 4:
				System.out.println(n1%n2);
				break;
			case 5:
				if(n2!=0) {
				System.out.println(n1/n2);
				}
				else {
					System.out.println("Not divisible by 0");
				}
				break;
			}
			 if(choice==6) 
				{
				System.out.println("exit");
				}
				else {
					System.out.println("Invalid choice");
				}
				}
		while(choice!=6 && choice>6);
	}
}
