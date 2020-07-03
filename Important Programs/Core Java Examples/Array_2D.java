import java.util.Scanner;

public class Array_2D 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter no of rows");
		int row = sc.nextInt();
		System.out.println("Enter no of Columns");
		int col = sc.nextInt();
		int arr[][] = new int [row][col];
		
		System.out.println("Rows : "+arr.length);
		System.out.println("Cols : "+arr[0].length);
		input(arr);
		display(arr);
	}

	static void display(int[][] arr) 
	{
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr[i].length; j++) 
			{
				System.out.print(arr[i][j] +"\t");
			}
			System.out.println();
		}
		
	}

	static void input(int[][] arr) 
	{
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println("Enter the elements for row "+i);
			for (int j = 0; j < arr[i].length; j++) 
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
	}
}
