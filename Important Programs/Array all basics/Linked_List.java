import java.util.*;
public class Linked_List 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		System.out.println(list);
		list.addFirst(11);
		list.addLast(22);
		list.add(33);
		list.add(44);
		list.addFirst(55);
		
		int larg = list.get(0);
		
		for (Integer x : list) 
		{
			System.out.println(x);
			if(larg < x)
				larg = x;
		}
		System.out.println("Largest :"+larg);
		
		System.out.println(list);
		System.out.println(list.size());
		
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		
	}
}
