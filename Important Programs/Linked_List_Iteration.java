package lit;
import java.util.*;
public class Linked_List_Iteration {

	public static void main(String[] args) 
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		System.out.println(list);
		list.addFirst(11);
		list.addLast(33);
		list.addLast(new Integer (55));
		list.add(2,300);
		list.add(1,40);
		list.addFirst(90);
		System.out.println(list); 
		
		System.out.println("travere by Object");
		System.out.println(list);
		
		System.out.println("traverse by get()");
		for (int i = 0; i < list.size(); i++) 
		{
			System.out.print(list.get(i)+"\t");
		}
		System.out.println();
		
		System.out.println("traverse by foreach loop");
		for(Integer element : list)
			System.out.print(element +"\t");
		System.out.println();
		
		
		Object arr[] = list.toArray();
		System.out.println("traverse by array..");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] +"\t");
		System.out.println();
		
		System.out.println("traverse by Iterator interfce");
		Iterator<Integer> itr1 = list.iterator();
		while(itr1.hasNext())
			System.out.print(itr1.next()+"\t");
		System.out.println();
		
		System.out.println("traverse by ListIterator interfce (forward)");
		ListIterator<Integer> itr2 = list.listIterator();
		while(itr2.hasNext())
			System.out.print(itr2.next()+"\t");
		System.out.println();
		
		System.out.println("Traverse by ListIterator interface (backward)");
		while(itr2.hasPrevious())
			System.out.print(itr2.previous()+"\t");
		System.out.println();
	}

}
