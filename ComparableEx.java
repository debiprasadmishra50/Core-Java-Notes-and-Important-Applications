import java.util.ArrayList;
import java.util.Collections;
class Student implements Comparable<Student>
{

	int rollno;
	String name;
	int age;
	Student(int rollno,String name,int age)
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
	public int compareTo(Student o) 
	{
		if(age==o.age)
		return 0;
		else if(age>o.age)
			return 1;
		else
			return -1;
	}
	
}

public class ComparableEx 
{
	public static void main(String[] args) 
	{
		ArrayList<Student> list=new ArrayList<Student>();
		
		list.add(new Student(101,"java",23));
		list.add(new Student(102,"c++",22));
		list.add(new Student(103,"c",20));
		list.add(new Student(104,"html",15));
		Collections.sort(list);
		for(Student s:list)
			System.out.println(s.rollno+" "+s.name+" "+s.age);
	}

}
