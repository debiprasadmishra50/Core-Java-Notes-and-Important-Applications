import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Example 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.println(list);
		
		list.add(0,11);
		list.add(0, 21);
		list.add(1, 31);
		list.add(41);
		System.out.println(list);
		
		System.out.println("Traversing using get()");
		for (int i = 0; i < list.size(); i++) 
		{
			System.out.print(list.get(i)+"\t");
		}
		
		list.remove(0);
		System.out.println("\n"+list);
		
//		list.removeAll(list);
//		System.out.println(list);
//		list.clear();
//		System.out.println(list);
		
		System.out.println("Traversing using Iterator");
		Iterator<Integer> itr1 = list.iterator();
		while (itr1.hasNext()) 
		{
			System.out.print(itr1.next()+"\t");
		}
		
	}
}
