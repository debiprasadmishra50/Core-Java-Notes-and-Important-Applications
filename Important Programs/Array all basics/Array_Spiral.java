package calender;

public class Array_Spiral 
{
	static java.util.Scanner sc = new java.util.Scanner(System.in);
	public static void main(String[] args)  
	{
		System.out.println("Enter no");
		int no = sc.nextInt();
		int arr[][] = new int [no][no];
		
		Array_Spiral.input(arr,no);
		Array_Spiral.display(arr);
	}
	static void display(int arr[][])
	{
		for (int i = 0; i < arr.length; i++) 
		{	
			for (int j = 0; j < arr.length; j++) 
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	static void input(int arr[][] , int no)
	{
		int i = 0,j = 0,k = 0,l = 0,m = no-1; //m = 3
		while(l <= m)
		{
			while(j<=m)
			{
				while(i<=m)
				{
					arr[i][j] = ++k;
					if(j==m)
						i++;
					else
						j++;
				}
				i--;j--;
				break;
			}
			while(j >= l)
			{
				while(i > l)
				{
					arr[i][j] = ++k;
					if(j==l)
						i--;
					else
						j--;
				}
				i++;j++;
				break;
			}
			l++;m--;
		}
	}
}
