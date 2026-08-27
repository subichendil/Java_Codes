
import java.util.*;
public class ATMApplicationDoWhile {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	
	double bal=10000;
	double amt;
	int choice;
	
	do
	{
		System.out.println("1 - Balance");
		System.out.println("2 - Withdraw");
		System.out.println("3 - Deposit");
		System.out.println("4 - Exit");
		
		System.out.println("Enter ur choice: ");
		choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("Curent Balance: " + bal);
			break;
		case 2:
			System.out.println("Enter amt to withdraw: ");
			amt=sc.nextDouble();
			if(amt<=bal) {
				bal=bal-amt;
			System.out.println("Withdrawal Successful");
			System.out.println("Remaining bal: "+bal);
			}
			else
			{
				System.out.println("Insufficient balance");
			}
			break;
		case 3:
			System.out.println("Enter amt to deposit: ");
			amt=sc.nextDouble();
			bal=bal+amt;
			System.out.println("Current updated Balance: "+ bal);
			break;
		case 4:
			System.out.println("thanks for using");
			break;
			
			default:
				System.out.println("Invalid choice");
		}
	}while(choice!=4 && choice>4);
}
}
