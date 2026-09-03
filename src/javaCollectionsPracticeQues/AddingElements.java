package javaCollectionsPracticeQues;
import java.util.LinkedList;
public class AddingElements {
	public static void main(String[]args)
	{
		LinkedList<Integer>elements=new LinkedList<>();
		elements.add(1);
		elements.add(2);
		elements.add(3);
		
		elements.addFirst(0);
		elements.addLast(4);
		System.out.println("Elements: "+elements);
	}

}
