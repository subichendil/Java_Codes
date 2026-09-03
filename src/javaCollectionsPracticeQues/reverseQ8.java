package javaCollectionsPracticeQues;

import java.util.ArrayList;

public class reverseQ8 {
	public static void main(String[]args)
	{
		ArrayList<Integer>numbers=new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		 
		System.out.println("List: "+numbers);
		
		System.out.println("Reversed List: ");
		for(int i=numbers.size()-1;i>=0;i--)
		{
			System.out.println(numbers.get(i));
		}
	}

}
