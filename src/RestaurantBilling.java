
import java.util.Scanner;
public class RestaurantBilling {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter User's choice: ");
	int menu=sc.nextInt();
	
	switch(menu) {
	case 1:
		System.out.println("Item: Pasta and Price: 300");
		break;
	case 2:
		System.out.println("Item: Dosa and Price: 120");
		break;
	case 3:
		System.out.println("Item: Poha and Price: 150");
		break;
	case 4:
		System.out.println("Item: Pizza and Price:640");
		break;
	case 5:
		System.out.println("Item: DBC and Price:250");
		break;
	}
  }
}
