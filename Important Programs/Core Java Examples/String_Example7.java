
public class String_Example7 
{
	public static void main(String[] args) 
	{
		String s1 = "";
		System.out.println(s1); //Print just a new line
		System.out.println(s1.length()); //0
		
		String s2 = null;
		System.out.println(s2); //print null
		System.out.println(s2.length()); //NullPointerException
	}
}
