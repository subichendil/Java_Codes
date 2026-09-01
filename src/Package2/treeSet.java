package Package2;

import java.util.TreeSet;

public class treeSet {
	public static void main(String[]args)
	{
		TreeSet<Integer> set=new TreeSet<>();
		set.add(40);
		set.add(10);
		set.add(30);
		set.add(20);
		
		/***System.out.println(set);
		System.out.println(set.first());
		System.out.println(set.last());
		
		set.remove(20);
		System.out.println(set);
		
		System.out.println(set.size());
		System.out.println(set.descendingSet());
		System.out.println(set.headSet(30));
		System.out.println(set.tailSet(30));
		System.out.println(set.subSet(10, 40));***/
		
		int[] arr = {5,2,2,8,1};
		TreeSet<Integer> unique = new TreeSet<>();
		
		for(int num:arr) {
			unique.add(num);
		}
		System.out.println(unique);
		
		System.out.println(unique.pollFirst());
		System.out.println(unique.pollLast());
		System.out.println(unique.isEmpty());
		unique.clear();
		/*System.out.println(unique);*/
		
		int[]arr2= {5,2,8,1};
		
		for(int i=0; i<arr2.length;i++)
		{
			for(int j=i+1; j<arr2.length; j++)
			{
			if(arr2[i]>arr2[j])
			{
				int temp= arr2[i];
				arr2[i]=arr2[j];
				arr2[j]=temp;
			}
			}
		}
		for(int num:arr2)
		{
			System.out.println(num);
		}
		
	}

}
