package javaCollectionsPracticeQues;
import java.util.ArrayList;
public class presenceOfAnElementQ6 {
public static void main(String[]args)
{
	ArrayList<Integer>numbers=new ArrayList<>();
	numbers.add(10);
	numbers.add(20);
	numbers.add(30);
	numbers.add(40);
	numbers.add(50);
	System.out.println("List: "+numbers);
	System.out.println("Is 40 present in the List: "+ numbers.contains(40));
}
}
