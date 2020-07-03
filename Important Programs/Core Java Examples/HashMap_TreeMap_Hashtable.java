import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class HashMap_TreeMap_Hashtable 
{
	public static void main(String[] args) 
	{
		HashMap<Integer , String> map1 = new HashMap<Integer , String> ();
		map1.put(100, "Raja");
		map1.put(100, "Rani");
		map1.put(10, "Hi");
		map1.put(11, "Hi");
		map1.put(1, "Z");
		System.out.println(map1);
		
		Hashtable<Integer , String> map2 = new Hashtable<Integer , String> ();
		map2.put(100, "Raja");
		map2.put(100, "Rani");
		map2.put(10, "Hi");
		map2.put(11, "Hi");
		map2.put(1, "Z");
		System.out.println(map2);
		
		TreeMap<Character , String> map3 = new TreeMap<Character , String> ();
		map3.put('J', "Java");
		map3.put('O', "Oracle");
		map3.put('S', "Spring");
		map3.put('H', "Hibernate");
		map3.put('A', "Advance Java");
		System.out.println(map3);
		
		System.out.println(map3.firstEntry());
		System.out.println(map3.lastEntry());
		System.out.println(map3.keySet());
		System.out.println(map3.values());
		System.out.println(map3.entrySet());
		System.out.println(map3.containsKey('H'));
		System.out.println(map3.containsValue("Java"));
		System.out.println(map3.size());
		System.out.println(map3.get('J'));
		map3.remove('J');
		System.out.println(map3);
	}
}
