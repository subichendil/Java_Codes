
import java.util.*;
public class EvenNumbers1to100 {
public static void main(String[]args) {
	int n=100;
	System.out.println("Even numbers from 1 to 100: ");
	for(int i=1; i<=n; i++) {
		if(i%2==0) {
			System.out.println(i+" ");
		}
	}
}
}
