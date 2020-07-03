import java.util.Scanner;

public class String_Example3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s1 = sc.nextLine();
		System.out.println(s1);
		String s2[] = s1.split(" ");
		
		int count=0;
		for (String s : s2) 
		{
			System.out.println(s+"\t"+s.length());
			if(!s.isEmpty())
				count++;
		}
		System.out.println("No of words : "+count);
	} 
}
