package collection.Stack;

import java.util.Stack;

public class Stack_Ex 
{
	public static void main(String[] args) 
	{
		Stack<Integer> st = new Stack<>();
		boolean empty = st.isEmpty();
		System.out.println(empty);
		st.push(11);
		st.push(21);
		st.push(11);
		st.push(23);
		st.push(54);
		System.out.println(st);
		st.pop();
		st.pop();
		st.push(77);
		st.push(77);
		System.out.println(st);
		
		st.add(11);
		System.out.println(st);
		st.add(0, 25);
		System.out.println(st);
		
		System.out.println(st.peek());
		System.out.println(st.search(55));
		System.out.println(st.empty());
		System.out.println(st.isEmpty());
		System.out.println(st.size());
		st.clear();
		System.out.println(st);
	}
}
