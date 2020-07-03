package lit;
import java.util.*;
public class Queue_Deque {

	public static void main(String[] args) 
	{
		Queue<Integer> q = new LinkedList<Integer>();
		System.out.println(q.isEmpty());
		
		//display the first element (peek , element)
		System.out.println(q.peek());
		// System.out.println(q.element());  //error  //NoSuchElementException
		
		//delete first element (poll , remove
		System.out.println(q.poll());
	//	System.out.println(q.remove());  //NoSuchElementException
		
		q.add(100);
		q.add(200);
		q.add(300);
		q.add(400);
		q.add(500);
		
		System.out.println(q);
		q.remove(); //delete first element
		q.poll(); //delete first element
		System.out.println(q);
		System.out.println(q.poll()); //delete first element
		System.out.println(q.peek());
		
	}

}
