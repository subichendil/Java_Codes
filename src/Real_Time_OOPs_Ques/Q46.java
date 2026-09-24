package Real_Time_OOPs_Ques;

class BankAccount
{
	private int accNumber;
	private String accName;
	private double balance;
	
	public void setAccNumber(int number)
	{
		accNumber=number;
	}
	public int getAccNumber()
	{
		return accNumber;
	}
	public void setAccName(String name)
	{
		accName=name;
	}
	public String getAccName()
	{
		return accName;
	}
	public void setBalance(double amount)
	{
		balance=amount;
	}
	public double getBalance()
	{
		return balance;
	}
}

public class Q46 
{
	public static void main(String[]args)
	{
		BankAccount b1=new BankAccount();
		b1.setAccNumber(1234);
		b1.setAccName("Anu");
		b1.setBalance(80000);
		
		System.out.println("Account number: "+b1.getAccNumber());
		System.out.println("Account holder Name: "+b1.getAccName());
		System.out.println("Balance: "+b1.getBalance());
	}
}
