
public class StringBuffer_1
{
	public static void main(String[] args) 
	{
		//palindrome  or not
		String s1 = new String ("MadaM");
		StringBuffer sb1 = new StringBuffer(s1); //s1 to sb1
		sb1.reverse();
		String s2 = new String (sb1); //sb1 to s2
		if(s1.equals(s2))
			System.out.println("Yes palondrome");
		else 
			System.out.println("not palindrome");
		
		char arr[] = s1.toCharArray(); //s1 to arr
		arr[1]='A';
		String s3 = new String (arr); //arr to s3
		System.out.println(s3);
		
		//StringBuilder is synchronized
		
		StringBuilder sb2 = new StringBuilder("Welcome"); //Thread safe String
		System.out.println(sb2.length());
		System.out.println(sb2.charAt(0));
		
		
	}
}
