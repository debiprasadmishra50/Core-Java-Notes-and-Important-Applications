import java.util.*;
public class Vector_Example 
{
	public static void main(String[] args) 
	{
		Vector<Integer> v = new Vector<Integer>();
		
		v.addElement(11);
		v.addElement(21);
		v.addElement(31);
		v.addElement(11);
		v.add(1,100);
		v.add(2,200);
		v.add(3,300);
		System.out.println(v);
		
		v.remove(0);
		v.removeElement(200);
		System.out.println(v);
		
		Enumeration e = v.elements();
		while(e.hasMoreElements())
			System.out.print(e.nextElement()+"\t");
	}
}
