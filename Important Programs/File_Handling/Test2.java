package File_Handling;
import java.io.*;
import java.util.Date;
public class Test2 
{
	public static void main(String[] args) throws Exception 
	{
		File f1 = new File("hello.txt"); //f1 refers to location only
		System.out.println(f1.createNewFile());
		
		System.out.println(f1.length());
		System.out.println(f1.lastModified()); //epoch time, time from jan1 1970 to till now in milisecond format
		System.out.println(new Date(f1.lastModified()));
		
		System.out.println(f1.isFile());
		System.out.println(f1.isDirectory());
		System.out.println(f1.canRead());
		System.out.println(f1.canWrite());
		System.out.println(f1.canExecute());
		System.out.println(f1.isHidden());
		System.out.println(f1.exists());
		System.out.println(f1.getName());
		System.out.println(f1.getAbsolutePath());
		
		f1.setWritable(false);
		System.out.println(f1.canWrite());
		f1.setWritable(true);
		System.out.println(f1.canWrite());
	}
}
