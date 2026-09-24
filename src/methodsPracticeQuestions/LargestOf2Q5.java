package methodsPracticeQuestions;

public class LargestOf2Q5 {
	static void largest(int a, int b) {
		if(a>b)
		{
			System.out.println(a+ " is the largest");
		}
		else
		{
			System.out.println(b+ " is the largest");	
		}
	}

	public static void main(String[]args)
	{
		largest(10,20);
	}

}
