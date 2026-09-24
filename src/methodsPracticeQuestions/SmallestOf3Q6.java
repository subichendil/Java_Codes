package methodsPracticeQuestions;

public class SmallestOf3Q6 {
	static void smallest(int a, int b, int c)
	{
		int small=a;
		if(b<small) {
			small=b;
		}
		if(c<small)
		{
			small=c;
		}
		System.out.println("Smallest: "+small);
	}
	
	public static void main(String[]args)
	{
		smallest(10,2,80);
	}

}
