package methodsPracticeQuestions;

public class MultiplicationTableQ12 {
	static void multiTable(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n + " x "+i + " = "+ (n*i));
		}
	}
	
	public static void main(String[]args)
	{
		multiTable(5);
	}

}
