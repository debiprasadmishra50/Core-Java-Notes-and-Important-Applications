import java.util.Scanner;

public class Jagged_Array 
{
	static Scanner sc= new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the size of row...");
		int row = sc.nextInt();
		
		int arr[][]=new int [row][];
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println("enter the column size of row "+(i+1));
			int col=sc.nextInt();
			arr[i]= new int [col];
			
		}
		input(arr);
		display(arr);
				
	}
	 static void display(int[][] arr) 
	 {
		System.out.println("the jagged array is : ");
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr[i].length; j++) 
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	 }
	 static void input(int[][] arr) 
	 {
		 for (int i = 0; i < arr.length; i++) 
			{	
			 System.out.println("enter the elements for row"+(i+1));
			
				for (int j = 0; j < arr[i].length; j++) 
				{
					arr[i][j] = sc.nextInt();
				}
				System.out.println();
			}
 	 }
}
