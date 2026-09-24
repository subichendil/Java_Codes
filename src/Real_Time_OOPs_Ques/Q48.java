package Real_Time_OOPs_Ques;

abstract class Payment
{
	abstract void makePayment();
}

class GooglePay extends Payment
{
	void makePayment()
	{
		System.out.println("Payment made using gpay");
	}
}

public class Q48 
{
	public static void main(String[]args)
	{
		GooglePay g1=new GooglePay();
		g1.makePayment();
	}
}
