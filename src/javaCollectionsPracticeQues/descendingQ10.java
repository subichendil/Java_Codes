package javaCollectionsPracticeQues;

import java.util.ArrayList;

public class descendingQ10 {
	public static void main(String[]args)
	{
		ArrayList<Integer>numbers=new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		for(int i=0; i<numbers.size();i++)
		{
			for( int j=i+1; j<numbers.size();j++)
			{
				if(numbers.get(i)<numbers.get(j))
				{
					int temp=numbers.get(i);
					numbers.set(i, numbers.get(j));
					numbers.set(j, temp);
				}
			}
		}
		System.out.println("Descending order: "+numbers);
	}

}
