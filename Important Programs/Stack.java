package lit;
import java.util.*;
public class Stack {

	public static void main(String[] args) 
	{
		Stack<Character> st = new Stack<Character>();
		System.out.println(st);
		st.push('J');
		st.push('A');  //insert the element at top
		st.push('V');
		st.push('A');
		
		System.out.println(st);
		System.out.println(st.peek()); //top of the stack
		System.out.println(st.search('J'));  //search the position of the character
		st.pop(); //delete element from top //always
		
		System.out.println(st);
		System.out.println(st.empty()); //check if the Stack is empty
		System.out.println(st.size());  //returns the size of stack
		
		
	}

}
