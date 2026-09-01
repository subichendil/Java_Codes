package Package2;
import java.util.*;
import java.util.HashSet;
public class Hashset {
	public static void main(String[]args)
	{
		HashSet<Integer> set= new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);
		/***set.remove(20);
		System.out.println(set);
		System.out.println(set.contains(10));
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		
		for(int val:set) {
			System.out.println(val);***/
		
		Iterator<Integer> itr= set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		/***HashSet<Integer> set2= new HashSet<>();
		
		set2.add(40);
		set2.add(50);
		
		set.addAll(set2);
		System.out.println(set2);
		/*set2.removeAll(set2);
		System.out.println(set);
		System.out.println(set2);
		
		System.out.println(set.add(5));
		System.out.println(set.add(5));/**/
		
	}

}
