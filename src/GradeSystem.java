
import java.util.Scanner;
public class GradeSystem {
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Choice 1 denotes Grade A");
	System.out.println("Choice 2 denotes Grade B");
	System.out.println("Choice 3 denotes Grade C");
	System.out.println("Choice 4 denotes Grade D");
	System.out.println("Choice 5 denotes Grade F");
	System.out.println("Enter Grade of your choice: ");
	int n=sc.nextInt();
	
	switch(n)
	{
	case 1:
		System.out.println("Outstanding performance");
		break;
	case 2:
		System.out.println("Above Average");
		break;
	case 3:
		System.out.println("Average performance");
		break;
	case 4:
		System.out.println("Below Average");
		break;
	case 5:
		System.out.println("Fail");
		break;
	}
	
	}
}
