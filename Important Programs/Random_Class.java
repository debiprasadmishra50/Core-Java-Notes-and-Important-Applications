import java.util.Random;

public class Random_Class 
{
	public static void main(String[] args) 
	{
		Random r = new Random();
		int x = r.nextInt();
		System.out.println(x);
		int y = r.nextInt(1000);
		System.out.println(y);
		
	}
}
