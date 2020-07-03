import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSet_Example 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> set1 = new HashSet<Integer>();
		TreeSet<Integer> set2 = new TreeSet<Integer>();
		int arr[] = {11,22,22,11,2,1,23,1,11,22};
		
		for (int x : arr) 
		{
			set1.add(x);
			set2.add(x);
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(set1);
		System.out.println(set2);
		
		set2.remove(22);
		System.out.println(set2);
		System.out.println(set2.size());
	}
}
