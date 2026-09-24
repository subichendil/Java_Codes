package Real_Time_OOPs_Ques;

interface Browser
{
	void launchBrowser();
	void closeBrowser();
}

class chrome implements Browser
{
	public void launchBrowser() 
	{
		System.out.println("chrome launched");
	}
	public void closeBrowser()
	{
		System.out.println("chrome closed");
	}
}

public class Q49 
{
	public static void main(String[]args)
	{
		chrome c1=new chrome();
		c1.launchBrowser();
		System.out.println("Executing");
		c1.closeBrowser();
	}
}
