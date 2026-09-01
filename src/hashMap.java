import java.util.HashMap;
import java.util.Map;

public class hashMap {
	public static void main(String[]args)
	{
		HashMap<Integer, String> map=new HashMap<>();
		map.put(1, "Java");
		map.put(2, "R");
		map.put(3, "Python");
		
		/***System.out.println(map);
		System.out.println(map.get(1));
		System.out.println(map.remove(2));
		System.out.println(map.containsKey(1));
		System.out.println(map.containsValue("R"));
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		
		for(Integer key:map.keySet())
		{
			System.out.println(key);
		}
		

		for(String val: map.values())
		{
			System.out.println(val);
		}
		
		for(Map.Entry<Integer, String>e: map.entrySet()) {
			System.out.println(e.getKey()+ " "+ e.getValue());
		}
		map.replace(3, "c");
		System.out.println(map);***/
		
		map.putIfAbsent(4, "SQL");
		map.clear();
		map.put(1, "A");
		map.put(2, "B");
		System.out.println(map);
	}

}
