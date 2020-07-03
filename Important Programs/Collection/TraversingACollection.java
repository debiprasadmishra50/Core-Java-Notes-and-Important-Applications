package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
public class TraversingACollection 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		//Traversing Techniques
		System.out.println(list);
		
		for (Integer integer : list) 
			System.out.print(integer+"\t");
		System.out.println();
		
		Object[] array = list.toArray();
		for (Object object : array)
			System.out.print(object+"\t");
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) 
			System.out.print(list.get(i)+"\t");
		System.out.println();
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+"\t");
		System.out.println();
		
		ListIterator<Integer> ltr = list.listIterator();
		while(ltr.hasNext())
			System.out.print(ltr.next()+"\t");
		System.out.println();
		while(ltr.hasPrevious())
			System.out.print(ltr.previous()+"\t");
		System.out.println();
		
		Enumeration<Integer> e = Collections.enumeration(list);
		while(e.hasMoreElements())
			System.out.print(e.nextElement()+"\t");
		
	}
}
