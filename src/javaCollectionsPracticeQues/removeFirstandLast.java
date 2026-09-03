package javaCollectionsPracticeQues;

import java.util.LinkedList;

public class removeFirstandLast {
	public static void main(String[]args)
	{
		LinkedList<Integer>elements=new LinkedList<>();
		elements.add(1);
		elements.add(2);
		elements.add(3);
		
		elements.removeFirst();
		elements.removeLast();
		System.out.println("Elements: "+elements);
	}


}
