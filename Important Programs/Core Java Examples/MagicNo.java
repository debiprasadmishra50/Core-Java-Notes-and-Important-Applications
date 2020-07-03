import java.util.Scanner;

public class MagicNo {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter a Number");
		int x = sc.nextInt();
		int sum = 0,rev = 0, y, t = x;

		while(x > 0)
		{
			sum =sum + (x%10);
			x = x/10;
		
		}
		System.out.println(sum);
		int a = sum;
		while(sum > 0)
		{
			rev = rev*10 + sum % 10;
			sum = sum/10;
		}
		System.out.println(rev);
		
		y = a * rev;
		if(y == t)
			System.out.println("Magic no");
		else
			System.out.println("Not a magic no");

	}

}
