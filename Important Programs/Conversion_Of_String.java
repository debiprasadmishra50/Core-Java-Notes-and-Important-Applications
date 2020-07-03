package lit;

import java.util.Arrays;

public class Conversion_Of_String {

	public static void main(String[] args) 
	{
		String s1 = new String ("Hello");
		
		char arr[] = s1.toCharArray(); //String to Array
		
		arr[0] = 'M';
		arr[1] = 'A';
		arr[2] = 'D';
		arr[3] = 'A';
		arr[4] = 'M';
		System.out.println(s1);
		
		s1 = new String(arr); // Array to String
		System.out.println(s1);
		System.out.println(Arrays.toString(arr));
		
		StringBuffer sb1 = new StringBuffer(s1); // convert String to StringBuffer
		System.out.println(sb1.reverse());
		String s2 = new String(sb1);//StringBuffer to String
		
		if(s1.equals(s2))
			System.out.println("Yes pallindrome");
		else
			System.out.println("Not a pallindrome");
	
		
		
		

	}

}
