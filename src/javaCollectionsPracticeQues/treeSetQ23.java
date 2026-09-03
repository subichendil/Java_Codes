package javaCollectionsPracticeQues;

import java.util.TreeSet;

public class treeSetQ23 {
	public static void main(String[]args) {
		TreeSet<Integer>set=new TreeSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		
		System.out.println("1st: "+set.first());
		System.out.println("Last: "+set.last());

	}

}
