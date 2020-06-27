
//An Immutable class
 final class Student
{
	 final String name;
	 final int regno;
	 public Student(String name,int regno)
	 {
		 this.name=name;
		 this.regno=regno;
	 }
	 public String getName()
	 {
		 return name;
	 }
	 public int getRegNo()
	 {
		 return regno;
	 }
	
}

public class ImmutableClass 
{
	public static void main(String[] args)
	{
		Student s=new Student("ABC",102);
		System.out.println(s.getName());
		System.out.println(s.getRegNo());
		//final varible not reinstalized
		//s.regno=102;
		
	}

}
