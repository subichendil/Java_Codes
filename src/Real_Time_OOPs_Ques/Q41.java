package Real_Time_OOPs_Ques;

class ATM
{
	private int pin;
	private double balance;
	
	ATM(int pin, double balance)
	{
		this.pin=pin;
		this.balance=balance;
	}
	void checkBalance(int enteredPin)
	{
		if(enteredPin==pin)
		{
			System.out.println("Balance: "+balance);
		}
		else
		{
			System.out.println("Invalid Pin");
		}
	}
	
	void deposit(double amount)
	{
		balance = balance+amount;
		
		System.out.println("Amount Deposited: "+amount);
	}
	
	void withdraw(double amount)
	{
		if(amount<=balance)
		{
			balance=balance-amount;
			System.out.println("Amount withdrawn: "+amount);
		}
		else
		{
			System.out.println("Insufficient balance");
		}
	}
}

public class Q41 
{
	public static void main(String[]args)
	{
		ATM a1=new ATM(1234, 50000);
		a1.checkBalance(1234);
		a1.deposit(5000);
		a1.withdraw(10000);
		a1.checkBalance(1234);
	}
}
