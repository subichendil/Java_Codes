
import java.util.*;
public class YorN {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	
	char choice;
	
	do
	{
		System.out.println("Do u want to continue?(Y/N): ");
		choice=sc.next().charAt(0);
	}while(choice=='Y'|| choice=='y');
	System.out.println("Program ends");
}
}
