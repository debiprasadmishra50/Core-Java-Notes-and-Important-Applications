package String_Ex;

public class StringHashcode 
{
	public static void main(String[] args) 
	{
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		String s5 = "Hello";
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);
		System.out.println(s2 == s3);
		System.out.println(s2 == s4);
		System.out.println(s3 == s4);
		
		System.out.println(s1 == s5);
		System.out.println(s2 == s5);
		
		
		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		System.out.println(s1.hashCode() == s3.hashCode());
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		
		
		
	}
}
