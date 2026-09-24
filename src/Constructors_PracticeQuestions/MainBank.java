package Constructors_PracticeQuestions;

class Bank
{
	int accNumber;
	String accHolder;
	double balance;
	
	Bank(int No, String name, double bal)
	{
		accNumber=No;
		accHolder=name;
		balance=bal;
	}
}

public class MainBank 
{
	public static void main(String[]args)
	{
		Bank b1=new Bank(1001, "Subi", 50000);
		
		System.out.println("Account Number: "+b1.accNumber);
		System.out.println("Account Holder: "+ b1.accHolder);
		System.out.println("Balance: "+b1.balance);
	}
}
