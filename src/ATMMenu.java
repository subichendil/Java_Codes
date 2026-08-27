
import java.util.Scanner;
public class ATMMenu {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		double balance= 10000;
		
		System.out.println("1 - Check Balance");
		System.out.println("2 - Deposit");
		System.out.println("3 - Withdraw");
		System.out.println("4 - exit");
		System.out.println("Enter your choice: ");
		int n=sc.nextInt();
		
		switch(n)
		{
		case 1: 
			System.out.println("Balance: "+ balance);
			break;
		case 2:
			System.out.println("Enter the amount for deposit: ");
			double deposit=sc.nextDouble();
			balance=balance+deposit;
			System.out.println("deposit done");
			System.out.println("Updated balance: "+balance);
			break;
		case 3:
			System.out.println("Enter the withdrwal amount: ");
			double withdrawalAmt=sc.nextDouble();
			if(withdrawalAmt<=balance)
			{
				balance=balance-withdrawalAmt;
				System.out.println("Withdrawal done");
				System.out.println("remaining balance: "+balance);
			}
			else
			{
				System.out.println("Insufficient balance");
			}
			break;
		case 4:
			System.out.println("Thank u for using ATM - Exit");
			break;
			default:
				System.out.println("Invalid choice!");
		}

	}

}
