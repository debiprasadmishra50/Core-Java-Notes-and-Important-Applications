
public class String_Buffer 
{
	public static void main(String[] args) 
	{
		String s1 = new String("Hello");
		System.out.println(s1);
		System.out.println(s1.concat("Welcome"));
		System.out.println(s1);
		s1 = "Hello Welcome";
		System.out.println(s1);
		System.out.println("-----------------------------");
		
		StringBuffer sb1 = new StringBuffer("Hello");
		System.out.println(sb1);
		System.out.println(sb1.append("Welcome"));
		System.out.println(sb1);
		 
		long stop,start;
		 
		
	}
}
