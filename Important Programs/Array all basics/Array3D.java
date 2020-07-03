import java.util.Scanner;

public class Array3D 
{	
	static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) 
	{
		char ch = 'A';
		char arr[][][] = new char [2][3][2];
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr[i].length; j++) 
			{
				for (int k = 0; k < arr[i][j].length; k++) 
				{
					arr[i][j][k] = ch++;
					System.out.print(arr[i][j][k] +"\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
