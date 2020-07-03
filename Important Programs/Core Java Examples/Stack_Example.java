import java.util.Stack;

public class Stack_Example 
{
	public static void main(String[] args) 
	{
		Stack<Integer> st = new Stack<Integer>();
		
		st.push(11);
		st.push(21);
		st.push(11);
		st.push(31);
		st.push(11);
		st.push(41);
		st.push(51);
		st.push(11);
		
		System.out.println(st);
		System.out.println(st.peek()); //print very first element
		System.out.println(st.search(11)); //search, where 1st time got, print the index
		System.out.println(st.pop()); //delete very first elements
		System.out.println(st);
		System.out.println(st.empty());
		System.out.println(st.size());
		st.clear();
		System.out.println(st);
	}
}
