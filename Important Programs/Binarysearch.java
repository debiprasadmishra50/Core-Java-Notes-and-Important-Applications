public class Binarysearch {
	public static int contains(int a[], int target, int i, int j)
	{
		while(i<=j)
		{
			int mid = (i+j)/2;
			if(target==a[mid])
				return mid+1;
			else if (target<a[mid])
				j = mid-1;
			else
				i = mid+1;
		}
		return -1;
	}
	public static int containsRecursion(int a[], int target, int i, int j)
	{
		if(i<j)
		{
			int mid = (i+j)/2;
			if(target==a[mid])
				return mid+1;
			else if (target<a[mid])
				return containsRecursion(a, target, i, mid-1);
			else
				return containsRecursion(a, target, mid-1, j);
		}
		else
			return -1;
	}
	public static void main(String[] args) {
		int a[] = {10,20,30,40,50,60,70,80,90,100};
		int i=0, j=a.length, target=35;
		//int doesContain = contains(a,target,i,j);		
		int doesContain = containsRecursion(a,target,i,j);
		System.out.println(doesContain);
		

	}

}

