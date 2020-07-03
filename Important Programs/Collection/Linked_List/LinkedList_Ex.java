package collection.Linked_List;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;;
public class LinkedList_Ex 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(12);
		list.add(12);
		list.add(15);
		list.add(14);
		list.add(15);
		System.out.println(list);
		list.add(3, 50);
		System.out.println(list);
		list.addFirst(9);
		System.out.println(list);
		list.addLast(16);
		System.out.println(list);
		Object list2 = list.clone();
		System.out.println(list2);
		Integer element = list.element();
		System.out.println(element);
		boolean equals = list.equals(list2);
		System.out.println(equals);
		boolean empty = list.isEmpty();
		System.out.println(empty);
		Integer peek = list.peek();
		System.out.println(peek);
		Integer peekLast = list.peekLast();
		System.out.println(peekLast);
		String string = list.toString();
		System.out.println(string);
		Object[] array = list.toArray();
		for (Object object : array) 
		{
			System.out.print(object+"\t");
		}
		System.out.println("\n"+Arrays.toString(array));
		int size = list.size();
		System.out.println(size);
		Integer integer = list.get(3);
		System.out.println(integer);
		int hashCode = list.hashCode();
		System.out.println(hashCode);
		boolean contains = list.contains(22);
		System.out.println(contains);
		
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);
		
		list.clear();
		System.out.println(list);
		
		
	}
}
