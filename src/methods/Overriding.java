package methods;

class One
{
	void show()
	{
		System.out.println("Parent class");
	}
}
class Two extends One
{
	void show()
	{
		System.out.println("Child class");
	}
}


public class Overriding {
	public static void main(String[]args)
	{
		One obj=new Two();
		obj.show();
	}
}
