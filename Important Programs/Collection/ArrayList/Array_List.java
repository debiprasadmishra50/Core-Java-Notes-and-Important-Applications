package collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Array_List 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<>();
		list.add("AG");
		list.add("XA");
		list.add("G");
		list.add("D");
		list.add("K");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);
		list.add("DEBI");
		System.out.println(list);
		
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("11");
		list1.add("12");
		list.addAll(list1);
		System.out.println(list1);
		System.out.println(list);
		
		
		
	}
}
