package methodsPracticeQuestions;

public class PrimeQ10 {
	static void prime(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(n+ " - prime");
		}
		else
		{
			System.out.println(n+ " - not prime");			
		}
	}
	
	public static void main(String[]args)
	{
		prime(10);
	}
}
