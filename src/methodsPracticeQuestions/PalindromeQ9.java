package methodsPracticeQuestions;

public class PalindromeQ9 {
	static void palindrome(int n)
	{
		int original=n;
		int rev=0;
		while(n!=0)
		{
			int digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		if(original==rev) {
			System.out.println(original+ " - Palindrome");
		}
		else
		{
			System.out.println(original+ " - Not a Palindrome");
		}
	}

	public static void main(String[]args)
	{
		palindrome(122);
	}
}
