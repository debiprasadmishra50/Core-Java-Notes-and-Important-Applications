public class Test
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter X");
		int x = sc.nextInt();
		System.out.println("Enter N");
		int n = sc.nextInt();
		//To Find X^N

		long p = 1, f = x, m = n, cnt = 0;	
		while(m > 0)
		{
			if(m%2 == 1)
				p = p*f;
			f = f*f;
			m = m/2;
			cnt++;
		}
		System.out.println(p);
		System.out.println("No of times loop ran "+cnt);
	}
}