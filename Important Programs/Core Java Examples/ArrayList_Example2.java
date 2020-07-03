import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList_Example2 
{
	public static void main(String[] args) 
	{
		ArrayList<Character> list = new ArrayList<Character>();
		
		System.out.println(list);
		
		list.add('A');
		list.add('B');
		list.add('C');
		list.add('D');
		System.out.println(list);
		
		ListIterator<Character> itr = list.listIterator();
		
		System.out.println("Traversing using ListIterator by forward :");
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("Traversing using ListIterator by backward :");
		while(itr.hasPrevious())
			System.out.println(itr.previous());
	}
}
