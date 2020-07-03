import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_Example 
{
	public static void main(String[] args) 
	{
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.add(11);
		q.add(12);
		q.add(14);
		q.add(15);
		System.out.println(q);
		q.remove();
		System.out.println(q);
		
		
		Deque<Integer> dq = new LinkedList<Integer>();
		
		dq.add(11);
		dq.addLast(12);
		dq.addFirst(14);
		dq.add(15);
		System.out.println(dq);
		dq.removeFirst();
		dq.removeLast();
		dq.remove();
		System.out.println(dq);
	}
}
