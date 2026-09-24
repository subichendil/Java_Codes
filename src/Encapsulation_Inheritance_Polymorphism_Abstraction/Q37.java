package Encapsulation_Inheritance_Polymorphism_Abstraction;

interface Browser
{
	void launchBrowser();
}

class Chrome implements Browser
{
	public void launchBrowser()
	{
		System.out.println("Chrome browser launched");
	}
}

public class Q37 
{
	public static void main(String[]args)
	{
		Chrome c1=new Chrome();
		c1.launchBrowser();
	}
}
