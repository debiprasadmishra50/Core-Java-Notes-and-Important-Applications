package Array_Ex;
import java.util.Arrays;
import java.util.Scanner;

public class TraversingOfArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int size = sc.nextInt();
		int arr [] = new int [size]; 
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Size of array is "+size);
		
		System.out.println("Traverse by for loop");
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		
		System.out.println("Traverse by for-each loop");
		for (int i : arr) 
		{
			System.out.print(i+"\t");
		}
		
		System.out.println("\nTraverse by Arrays class");
		System.out.println(Arrays.toString(arr));
	}
}
