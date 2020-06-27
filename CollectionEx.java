import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

class Student
{
	String name;
	double cgpa;
	int age;
	String courses[];
	Set<Long> phoneNo;
	List<String> emails;
	List<String> adress;
	Map<String, Long> refs;
	static Scanner sc=new Scanner(System.in);
	Student()
	{
		System.out.println("enter the name");
		name=sc.next();
		System.out.println("enter the cgpa");
		cgpa=sc.nextDouble();
		System.out.println("enter the age");
		age=sc.nextInt();
		System.out.println("enter the number of courses");
		int size=sc.nextInt();
		courses=new String[size];
		for(int i=0;i<courses.length;i++)
		{
			System.out.println("enter the new Course");
			courses[i]=sc.next();
		}
		phoneNo=new HashSet<Long>();
		
		
		String choice="" ;
		do
		{
			System.out.println("enter the phone number");
			phoneNo.add(sc.nextLong());
			System.out.println("Do u want add  phone number choice yes/no");
			 choice=sc.next();
			
		}while(choice.equalsIgnoreCase("yes"));
		emails=new ArrayList<String>();
		
		do
		{
			System.out.println("enter the email number");
			emails.add(sc.next());
			System.out.println("Do u want add emailNumber choice yes/no");
			 choice=sc.next();
			
		}while(choice.equalsIgnoreCase("yes"));
		adress=new LinkedList<String>();
		
		do
		{
			System.out.println("enter the adress number");
			adress.add(sc.next());
			System.out.println("Do u want add adress choice yes/no");
			 choice=sc.next();
			
		}while(choice.equalsIgnoreCase("yes"));
	
		refs=new HashMap<String, Long>();
		
		do
		{
			System.out.println("enter the new  refers");
			refs.put(sc.next(), sc.nextLong());
			System.out.println("Do u want add references choice yes/no");
			 choice=sc.next();
			
		}while(choice.equalsIgnoreCase("yes"));
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", cgpa=" + cgpa + ", age=" + age + ", courses=" + Arrays.toString(courses)
				+ ", phoneNo=" + phoneNo + ", emails=" + emails + ", adress=" + adress + ", refs=" + refs + "]";
	}
	
	
}
public class CollectionEx
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		TreeMap<Integer, Student> map=new TreeMap<Integer, Student>();
		String choice ;
		do
		{
			System.out.println("enter the a new Roll number");
			map.put(sc.nextInt(), new Student());
			System.out.println("Do u want add new student choice yes/no");
			 choice=sc.next();
			
		}while(choice.equalsIgnoreCase("yes"));
	
		System.out.println(map);
		
	}

}
