import java.util.Scanner;

public class Jagged_Array 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter no of rows");
		int row = sc.nextInt();
		
		int arr[][] = new int [row][];
		
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println("Enter the column size for row "+i);
			int col = sc.nextInt();
			arr[i] = new int[col];
		}
		
		input(arr);
		display(arr);
	}
	//input and display method is same as 2D program

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
