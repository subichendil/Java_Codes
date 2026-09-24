package methodsPracticeQuestions;

public class StringReverseQ15 {
	static void reverseString(String str)
	{
		String rev=" ";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("Reversed String: " + rev);
	}

	public static void main(String[]args)
	{
		reverseString("butterfly");
	}
}
