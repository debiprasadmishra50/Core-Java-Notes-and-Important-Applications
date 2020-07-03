package lit;
import java.util.*;
public class Vector_Example {

	public static void main(String[] args) 
	{
		Vector<Integer> v = new Vector<Integer>();
		
		v.addElement(100);
		v.addElement(200); //value wise
		v.addElement(300);
		v.add(0 , 300);  //index wise
		v.add(1, 400);
		System.out.println(v);
		System.out.println(v.size());
		
		Enumeration<Integer> e = v.elements();
		while(e.hasMoreElements())
			System.out.println(e.nextElement());
		v.remove(0);
		v.removeElement(400);
		//v.removeElement(300);
		System.out.println(v);
		
		
	}

}
