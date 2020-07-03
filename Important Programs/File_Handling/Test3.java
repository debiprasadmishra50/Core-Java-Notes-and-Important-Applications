package File_Handling;
import java.io.*;
import java.util.Date;
public class Test3 
{
	public static void main(String[] args) throws Exception 
	{
		File f1 = new File("hello.txt"); 
		System.out.println(f1.createNewFile());
		
		FileInputStream fis = new FileInputStream("hello.txt");
		//FileOutputStream fos = new FileOutputStream("hi.txt"); Create or replace the content
		FileOutputStream fos = new FileOutputStream("hi.txt" , true); //Create or append the content
		
		int ch;
		while((ch=fis.read()) != -1) //-1 indicates end of file
		{
			//Thread.sleep(1000);
			//System.out.print((char)ch);
			fos.write(ch); //write character into hi.txt
		}
		
		fis.close();
		fos.close();
		
		System.out.println("Done...:)");
	}
}
