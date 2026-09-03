package javaCollectionsPracticeQues;

import java.util.HashMap;
import java.util.Map;

public class HashMapQ29 {
	public static void main(String[]args)
	{
		HashMap<Integer, String>map=new HashMap<>();
		map.put(1, "Akshay");
		map.put(2, "Aadhi");
		map.put(3, "Ananya");
		map.put(4, "Shreyas");
		
		 for(Map.Entry<Integer, String>e: map.entrySet())
		 {
			 System.out.println(e.getKey()+" "+e.getValue());
		 }
	}

}
