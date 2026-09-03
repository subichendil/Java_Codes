package javaCollectionsPracticeQues;
import java.util.ArrayList;
import java.util.Collections;
public class smallestElementQ4 {
public static void main(String[]args)
{
	ArrayList<Integer>numbers=new ArrayList<>();
	numbers.add(10);
	numbers.add(20);
	numbers.add(30);
	numbers.add(40);
	numbers.add(50);
	
	int smallestElement=Collections.min(numbers);
	System.out.println("List: "+numbers);
	System.out.println("Smallest ELement: "+ smallestElement);
}
}
