package javaCollectionsPracticeQues;

import java.util.LinkedList;

public class searchElement {
	public static void main(String[]args)
	{
		LinkedList<Integer>elements=new LinkedList<>();
		elements.add(1);
		elements.add(2);
		elements.add(3);
		
		 
		System.out.println("Elements found: "+elements.contains(2));
	}


}
