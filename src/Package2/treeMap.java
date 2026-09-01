package Package2;
import java.util.Map;
import java.util.TreeMap;
public class treeMap {
public static void main(String[]args)
{
	TreeMap<Integer, String>map=new TreeMap<>();
	map.put(3, "Java");
	map.put(1, "C");
	map.put(2, "Python");
	System.out.println(map);
	/***System.out.println(map.firstKey());
	System.out.println(map.lastKey());
	map.remove(2);
	System.out.println(map);
	System.out.println(map.containsKey(1));
	System.out.println(map.size());
	System.out.println(map.headMap(3));
	System.out.println(map.tailMap(1));
	System.out.println(map.subMap(1, 3));
	System.out.println(map.descendingMap());
	System.out.println(map.pollFirstEntry());
	System.out.println(map.pollLastEntry());***/
	
	for(Map.Entry<Integer, String> e: map.entrySet()) 
	{
		System.out.println(e.getKey()+ " "+ e.getValue());
	}
	map.clear();
	System.out.println(map);
	System.out.println(map.isEmpty());
}
}

