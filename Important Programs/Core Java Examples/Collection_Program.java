import java.util.*;
class Students
{
	String name;
	int age;
	double cgpa;
	String courses[];
	Set<Long> phone_nos;
	List<String> emails;
	List<String> addresses;
	Map<String,Long> refs;
	
	Scanner sc = new Scanner(System.in);
	public Students()
	{
		System.out.println("Enter the name");
		name = sc.next();
		
		System.out.println("Enter the age");
		age = sc.nextInt();
		
		System.out.println("Enter the cgpa");
		cgpa = sc.nextDouble();
		
		System.out.println("Enter the no of courses");
		int size = sc.nextInt();
		courses = new String[size];
		for (int i = 0; i < courses.length; i++) 
		{
			System.out.println("Enter a new course");
			courses[i] = sc.next();
		}
		
		phone_nos = new HashSet<Long>();
		String choice = "";
		do 
		{
			System.out.println("Enter a Phone number");
			phone_nos.add(sc.nextLong());
			System.out.println("Do you want to add another Phone number");
			choice = sc.next();
		} while (choice.equalsIgnoreCase("Yes"));
		
		emails = new ArrayList<String>();
		do 
		{
			System.out.println("Enter new email id");
			emails.add(sc.next());
			System.out.println("Do you want to add another email-Id");
			choice = sc.next();
		} while (choice.equalsIgnoreCase("Yes"));
		
		addresses = new LinkedList<String>();
		do 
		{
			System.out.println("Enter new Address");
			addresses.add(sc.next());
			System.out.println("Do you want to add a new Address");
			choice = sc.next();
		} while (choice.equalsIgnoreCase("Yes"));
		
		refs = new HashMap<String , Long>();
		do 
		{
			System.out.println("Enter new reference");
			refs.put(sc.next(),sc.nextLong());
			System.out.println("Do you want to add a new reference");
			choice = sc.next();
		} while (choice.equalsIgnoreCase("Yes"));	
	}
	public String toString()
	{
		return  name+" "+age+" "+cgpa+" "+Arrays.toString(courses)+" "+phone_nos+" "+emails+" "+addresses+" "+refs+"\n";
	}
}
public class Collection_Program 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String choice = "";
		TreeMap<Integer , Students> map = new TreeMap<Integer , Students> ();
		do 
		{
			System.out.println("Enter a new Roll number");
			map.put(sc.nextInt(), new Students());
			System.out.println("Do you want to add another student");
			choice = sc.next();
		} while (choice.equalsIgnoreCase("Yes"));
		System.out.println("All the Student details");
		System.out.println(map);
		sc.close();
	}
	
}
