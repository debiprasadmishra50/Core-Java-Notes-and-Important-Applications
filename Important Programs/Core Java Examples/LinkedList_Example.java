import java.util.Collections;
import java.util.LinkedList;

public class LinkedList_Example 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		System.out.println(list);
		System.out.println(list.isEmpty());
		
		list.addFirst(11);
		list.addFirst(22);
		list.addLast(33);
		list.add(1, 44);
		list.add(1, 11);
		System.out.println(list);
		
		for (Integer x : list) 
		{
			System.out.print(x+"\t");
		}
		
		System.out.println("\n"+list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.get(3));
		
		Collections.sort(list);
		System.out.println("\nAfter sort "+list);
		Collections.reverse(list);
		System.out.println("After Reverse "+list);
		
		System.out.println(list.contains(22));
		System.out.println(list.indexOf(22));
		System.out.println(list.lastIndexOf(22));
		System.out.println(list.size());
		System.out.println(list.hashCode());
		
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		list1.add(100);
		list1.add(200);
		list1.add(300);
		System.out.println(list1);
		list.addAll(list1);
		list.addAll(2, list1);
		System.out.println(list);
		
		list.removeAll(list1);
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		list.removeLast();
		list.removeFirst();
		System.out.println(list);
	
		Object arr[] = list.toArray();
		for(Object obj:arr)
			System.out.print(obj+"\t");
		
		Object string = list.toString();
		System.out.println(string);
		
		
	}
}
