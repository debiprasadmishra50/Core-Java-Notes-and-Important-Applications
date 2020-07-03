import java.util.Arrays;
import java.util.Scanner;

public class Array1D 
{ 
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		input(arr);
		display(arr);
		//Arrays.sort(arr);
		Arrays.sort(arr);
		display(arr);
		int index = Arrays.binarySearch(arr, 11);
		if(index >= 0)
			System.out.println("found at "+index);
		else
			System.out.println("not found...");
		
		int brr[] = Arrays.copyOf(arr, 3);
		display(brr);
		int crr[] = Arrays.copyOfRange(arr, 1, 3);
		display(arr);
		
		System.out.println(Arrays.equals(arr, brr));
		System.out.println(Arrays.hashCode(arr));
		System.out.println("Display in a string format: "+Arrays.toString(arr));
		//Arrays.fill(arr,700);
		Arrays.fill(arr, 0,3,555);
		System.out.println("after fill: "+Arrays.toString(arr));
		
		
   		
	}

	static void input(int[] arr) 
	 {
		System.out.println("Enter the elements...");
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i] = sc.nextInt();
			
		}
	 }
	 static void display(int[] arr) 
	 {
		 System.out.println("The array is ...");
		 for (int i = 0; i < arr.length; i++) 
		 {
			System.out.print(arr[i]+"\t");
		 }
		System.out.println();
	 }

	 
}
