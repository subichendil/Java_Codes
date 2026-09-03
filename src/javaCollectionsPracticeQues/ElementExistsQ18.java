package javaCollectionsPracticeQues;

import java.util.LinkedHashSet;

public class ElementExistsQ18 {
	public static void main(String[]args)
	{
		LinkedHashSet<Integer>set=new LinkedHashSet<>();
		 
			set.add(1);
			set.add(2);
			set.add(3);
			set.add(4);
			
			 
			System.out.println("Element Exists? "+set.contains(4));
		

	}

}
