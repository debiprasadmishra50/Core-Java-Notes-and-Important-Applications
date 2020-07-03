
public class SumOfDigits {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int x = sc.nextInt();
		int a,b = 0,sum = 0,m=x,r,s = 0;
		while (x != 0) 
		{
			a = x%10;
			sum = sum+a;
			x = x/10;
			b = b*10+a;
			
		}
		
		while (b!=0)
		{
			r = b%10;
			s = s*10+r;
			b = b/10;
		}
		System.out.println(sum);
		System.out.println(b);
		System.out.println(s);

	}

}
