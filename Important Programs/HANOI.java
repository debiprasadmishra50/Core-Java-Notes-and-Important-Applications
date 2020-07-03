import java.util.Scanner;
public class HANOI {
	static void tower(int n, int A, int B, int C)
	{
		if(n>0)
		{
			tower(n-1,A,C,B);
			System.out.println(A+"-->"+C);
			tower(n-1,B,A,C);
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter the number of discs");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		tower(n,1,2,3);

	}

}
