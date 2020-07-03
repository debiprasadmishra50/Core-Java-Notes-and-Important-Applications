
public class String_Ex1
{
	public static void main(String[] args) 
	{
		String s1 = new String("Hello");
		
		System.out.println(s1);
		System.out.println(s1.isEmpty());
		System.out.println(s1.charAt(0));
		System.out.println(s1.indexOf("l"));
		System.out.println(s1.lastIndexOf("l"));
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.replace('l', 'k'));
		System.out.println(s1.contains("l"));
		System.out.println(s1.concat("welcome"));
		System.out.println(s1.codePointAt(0));
		System.out.println(s1.startsWith("h"));
		System.out.println(s1.endsWith("o"));
		System.out.println(s1.equalsIgnoreCase("hello"));
		System.out.println(s1.compareTo("hello"));
		System.out.println(s1.compareToIgnoreCase("hello"));
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(1, 4));
		
		
		char arr[] = s1.toCharArray();
		byte brr[] = s1.getBytes();
		for (int i = 0; i < brr.length; i++) 
		{
			System.out.println(arr[i]+"\t"+brr[i]);
			
		}
		String s2 = new String ("java is simple");
		String s3[] = s2.split(" ");
		for(String x : s3)
			System.out.println(x+"\t"+x.length());
		
	}
}
