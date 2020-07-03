import java.util.Scanner;

public class String_Example2 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		String s1 = "Hello";
		System.out.println(s1.length());
		System.out.println(s1.charAt(0));
		System.out.println(s1.indexOf('l'));
		System.out.println(s1.lastIndexOf('l'));
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(2, 4));
		System.out.println(s1.codePointAt(0));
		System.out.println(s1.concat(" Welcome"));
		System.out.println(s1.isEmpty());
		System.out.println(s1.contains("l"));
		System.out.println(s1.replace("l", "k"));
		System.out.println(s1.equals("Hello"));
		System.out.println(s1.equals("hello"));
		System.out.println(s1.equalsIgnoreCase("hello"));
		System.out.println(s1.compareTo("hello"));
		System.out.println(s1.compareToIgnoreCase("hello"));
		
	}
}
