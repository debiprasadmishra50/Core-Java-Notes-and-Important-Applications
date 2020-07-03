import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulation 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		System.out.println("Enter the size");
		int size = sc.nextInt();
		int arr[] = new int [size];
		
		input(arr);
		display(arr);
		
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("After sort : "+Arrays.toString(arr));
		int index = Arrays.binarySearch(arr, 11);
		if(index >= 0)
			System.out.println("Found at "+index);
		else
			System.out.println("Not Found");
		
		int brr[] = Arrays.copyOfRange(arr, 1, 3);
		System.out.println("After copy : "+Arrays.toString(brr));
		
		System.out.println(Arrays.equals(arr, brr));
	}
	private static void display(int[] arr) 
	{
		System.out.println("Display array elements");
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}
	private static void input(int arr[]) 
	{
		System.out.println("Enter the elements");
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i] = sc.nextInt();
		}
		
	}
}
