package File_Handling;
import java.io.*;
import java.util.Date;
public class Test4 
{
	public static void main(String[] args) throws Exception 
	{
		File f1 = new File("hello.txt"); 
		System.out.println(f1.createNewFile());
		
		BufferedReader br = new BufferedReader(new FileReader("hello.txt"));
//		BufferedWriter bw = new BufferedWriter(new FileWriter("hi.txt")); //Create or replace the content/
		BufferedWriter bw = new BufferedWriter(new FileWriter("hi.txt" , true));
		
		String text;
		int count = 0;
		while((text=br.readLine()) != null)
		{
//			Thread.sleep(1000);
//			System.out.println(text);
			
			bw.write(text +"\n");
			String s[] = text.split(" ");
			for (String x : s) 
			{
				if(x.equalsIgnoreCase("Java"))
					count++;
				String s1[] = x.split(".");
				for (String x1 : s) 
				{
					count++;
				}
			}
			
		}
		System.out.println(count +" times java");
		br.close();
		bw.close();
		System.out.println("Done...:)");
	}
}
