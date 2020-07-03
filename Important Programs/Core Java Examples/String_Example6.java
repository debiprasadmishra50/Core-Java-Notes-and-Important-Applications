
public class String_Example6 
{
	public static void main(String[] args) 
	{
		String s1 = "hello";
		System.out.println(s1);
		char arr[] = s1.toCharArray(); //String to char array
		for (char ch : arr) 
		{
			System.out.print(ch+"\t");
		}
		arr[0] = 'H';
		String s2 = new String(arr); //char array to string
		System.out.println("\n"+s2);
	}
}
