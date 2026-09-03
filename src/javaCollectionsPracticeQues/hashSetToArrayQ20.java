package javaCollectionsPracticeQues;

import java.util.LinkedHashSet;

public class hashSetToArrayQ20 {
	public static void main(String[]args)
	{
		LinkedHashSet<Integer>set=new LinkedHashSet<>();
		 
			set.add(1);
			set.add(2);
			set.add(3);
			set.add(4);
			Object[]arr=set.toArray();
			System.out.println("Conversion to Array: ");
			for(Object a:arr) {
				System.out.println(a);
			}
	}

}
