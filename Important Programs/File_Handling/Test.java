package File_Handling;
import java.io.*;
public class Test 
{
	public static void main(String[] args) throws Exception 
	{
		Thread.sleep(4000);
		File f1 = new File("hello.txt");
		System.out.println(f1.createNewFile());
		System.out.println("Done....");
		
		File f2 = new File("D:/devi","hello.mp4");
		System.out.println(f2.createNewFile());
		System.out.println("Done....");
		
		File f3 = new File("a");
		System.out.println(f3.mkdir());
		System.out.println("Done....");
		
		File f4 = new File("raja/rani/hello/hi");
		System.out.println(f4.mkdirs());
		System.out.println("Done....");
		
		Thread.sleep(4000);
		File f5 = new File("hi.mp4");
		System.out.println(f1.renameTo(f5));
		
		Thread.sleep(4000);
		System.out.println(f1.delete());
		System.out.println(f2.delete());
		System.out.println(f3.delete());
	}
}
