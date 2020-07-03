import java.util.Scanner;

public class String_Example 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		System.out.println(s1 == s2); //true
		System.out.println(s2 == s3); //false
		System.out.println(s3 == s4); //false
		
		System.out.println(s1.equals(s2)); //true
		System.out.println(s2.equals(s3)); //true
		System.out.println(s3.equals(s4)); //true
		
		System.out.println(s1.hashCode()); //69609650
		System.out.println(s3.hashCode()); //69609650
		
		System.out.println(s1 == s3); //false
		
		String s5 = new String("Java");
		
		System.out.println(s1.hashCode()); //69609650
		System.out.println(s5.hashCode()); //2301506
		
		
	}
}
