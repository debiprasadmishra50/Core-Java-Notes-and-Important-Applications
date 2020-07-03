package collection.Queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Ex 
{
	public static void main(String[] args) 
	{
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(11);
		q.add(22);
		q.add(33);
		q.add(44);
		q.remove();
		System.out.println(q);
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(11);
		pq.add(21);
		pq.add(31);
		pq.add(41);
		pq.add(51);
		pq.add(61);
		pq.remove();
		System.out.println(pq);
		Deque<Integer> dq = new LinkedList<Integer>();
		dq.add(10);
		dq.add(20);
		dq.add(30);
		dq.add(40);
		dq.remove();
		System.out.println(dq);
		
		
		
	}
}
