import java.util.Scanner;
class Student
{
	 int roll;
	 String name;
	 double cgpa;
}

public class ArrayOfObjects
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the size");
		int size = sc.nextInt();
		
		Student s[] = new Student[size];
		
		for (int i = 0; i < s.length; i++) 
		{
			System.out.println(s[i]);
			
			s[i] = new Student();
			System.out.println("Enter Details");
			s[i].roll = sc.nextInt();
			s[i].name = sc.next();
			s[i].cgpa = sc.nextDouble();
			
		}
		System.out.println("All Student Details");
		for (int i = 0; i < s.length; i++) 
		{
			System.out.println(s[i]);
			System.out.println(s[i].roll);
			System.out.println(s[i].name);
			System.out.println(s[i].cgpa);
		}
	}
}

//Sort the array of the objects based on roll (use interfaces comparator and comparable)
//Sort the array of the objects based on roll,name,cgpa
