package javaCollectionsPracticeQues;
import java.util.ArrayList;
public class sumOf5IntegersQ2 {
public static void main(String[]args)
{
	ArrayList<Integer> numbers=new ArrayList<>();
	numbers.add(10);
	numbers.add(20);
	numbers.add(30);
	numbers.add(40);
	numbers.add(50);
	
	int sum=0;
	for(int num:numbers)
	{
		sum+=num;
	}
	System.out.println("List: "+ numbers);
	System.out.println("Sum: "+ sum);
}
}
