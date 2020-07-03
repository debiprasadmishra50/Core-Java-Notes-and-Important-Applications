
public class String_Example5 
{
	public static void main(String[] args) 
	{
		String s1 = "MadaM";
		System.out.println(s1);
		StringBuffer sb1 = new StringBuffer(s1);
		sb1.reverse();
		System.out.println(sb1);
		String s2 = new String(sb1);
		if(s1.equals(s2))
			System.out.println("Pallindrome");
		else
			System.out.println("Not Pallindrome");
	}
}
