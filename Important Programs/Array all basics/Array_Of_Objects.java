import java.util.Scanner;

class student
{
	int roll;
	String name;
	double cgpa;
	
}
public class Array_Of_Objects
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size....");
		int size = sc.nextInt();
		student s[] = new student[size];
		
		for (int i = 0; i < s.length; i++) 
		{
			System.out.println(s[i]);
			s[i] = new student();
			System.out.println(s[i]);
			System.out.println("enter the details (roll,name,cgpa) for a new student");
			
			s[i].roll = sc.nextInt();
			s[i].name = sc.next();
			s[i].cgpa = sc.nextDouble();
		}
		
		System.out.println("all student details...");
		for (int i = 0; i < s.length; i++) 
		{
			System.out.println(s[i].roll+"\t"+s[i].name+"\t"+s[i].cgpa);

		}
	}
}
