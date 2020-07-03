
public class String_Example4 
{
	public static void main(String[] args) 
	{
		String s1 = "hello";
		System.out.println(s1);
		System.out.println(s1.concat(" Welcome"));
		System.out.println(s1);
		
		System.out.println("--------------------------");
		
		StringBuffer sb1 = new StringBuffer("hello");
		System.out.println(sb1);
		System.out.println(sb1.append(" welcome"));
		System.out.println(sb1);
	}
}
