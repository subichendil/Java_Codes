package javaCollectionsPracticeQues;

import java.util.LinkedList;

public class displayUsingIterator {
	public static void main(String[]args)
	{
		LinkedList<Integer>elements=new LinkedList<>();
		elements.add(1);
		elements.add(2);
		elements.add(3);
		
		for(int i=0;i<elements.size();i++)
		{
			System.out.println(elements.get(i));
		}
	}


}
