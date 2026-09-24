package Encapsulation_Inheritance_Polymorphism_Abstraction;

class BankAccount
{
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	
	public void setAccountNumber(int number)
	{
		accountNumber=number;
	}
	public int getAccountNumber()
	{
		return accountNumber;
	}
	public void setAccountHolderName(String name)
	{
		accountHolderName=name;
	}
	public String getAccountHolderName()
	{
		return accountHolderName;
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

public class Q28 {

	public static void main(String[]args)
	{
		BankAccount b1=new BankAccount();
		b1.setAccountNumber(1);
		b1.setAccountHolderName("Aadhik");
		b1.setBalance(50000);
		
		System.out.println("Acc Number: "+b1.getAccountNumber());
		System.out.println("Name: "+b1.getAccountHolderName());
		System.out.println("Balance: "+b1.getBalance());
	}
}
