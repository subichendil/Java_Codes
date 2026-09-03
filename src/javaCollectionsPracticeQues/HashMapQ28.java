package javaCollectionsPracticeQues;

import java.util.HashMap;

public class HashMapQ28 {
	public static void main(String[]args)
	{
		HashMap<Integer, String>map=new HashMap<>();
		map.put(1, "Akshay");
		map.put(2, "Aadhi");
		map.put(3, "Ananya");
		map.put(4, "Shreyas");
		System.out.println("IsPresent? : "+map.containsKey(3));
	}

}
