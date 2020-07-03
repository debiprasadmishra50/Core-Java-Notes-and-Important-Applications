package Array_Ex;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayProgram 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		int a = 10;
		@SuppressWarnings({ "deprecation", "unused" })
		Integer b = new Integer(10);
		
		
		@SuppressWarnings({ "unused", "resource" })
		Scanner sc = new Scanner(System.in);
		int arr [] = {11,12,33,445,56};
		System.out.println("Traverse by Arrays class");
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.binarySearch(arr, 20));
//		System.out.println(arr[5]);
		int brr[] = Arrays.copyOfRange(arr, 1, 5);
		System.out.println(Arrays.toString(brr));
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}
}
