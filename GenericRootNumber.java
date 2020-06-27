import java.util.Scanner;

public class GenericRootNumber 
{
	static void findOutGenericRootNumber(int n)
	{
		int s=0,r;
		while(n>0)
		{
			r=n;
			while(r>0)
			{
				s=s+r%10;
				r=r/10;
			}
			if(s<10)
				  break;
				n=s;
				s=0;
		}
		System.out.println("The Generic Number is"+s);



	}
	public static void main(String[] args) 
	{
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		findOutGenericRootNumber(input);

		
	}

}
