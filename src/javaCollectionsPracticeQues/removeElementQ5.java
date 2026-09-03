package javaCollectionsPracticeQues;
import java.util.ArrayList;
public class removeElementQ5 {
public static void main(String[]args)
{
	ArrayList<Integer>numbers=new ArrayList<>();
	numbers.add(10);
	numbers.add(20);
	numbers.add(30);
	numbers.add(40);
	numbers.add(50);
	System.out.println("List: "+numbers);
	numbers.remove(2);
	System.out.println("After removal: "+numbers);
}
}
