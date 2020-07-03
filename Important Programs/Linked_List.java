package lit;
import java.util.*;
public class Linked_List {

	public static void main(String[] args) 
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		list.addFirst(11);
		list.addLast(33);
		list.addLast(new Integer (55));
		list.add(2,300);
		list.add(1,40);
		list.addFirst(90);
		System.out.println(list); //traverse means display
		Collections.sort(list);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
		
		System.out.println(list.size());
		System.out.println(list.contains(55)); //search whether the element exist or not
		System.out.println(list.indexOf(55));
		System.out.println(list.lastIndexOf(55));
		
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		list1.addFirst(800);
		list1.addFirst(900);
		list1.addFirst(1000);
		System.out.println(list);
		System.out.println(list1);
		
		list.addAll(list1);  //Merging
		System.out.println(list);
		
		list.removeAll(list1);
		System.out.println(list);  //delete the merged part
		
		list.remove(2);  //delete at specific point
		System.out.println(list);

	}

}
