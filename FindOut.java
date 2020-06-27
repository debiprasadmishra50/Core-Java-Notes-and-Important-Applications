import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class FindOut
{
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the class name with pacgage name");
		//Eg:java.lang.Object
		String input=sc.nextLine();
		Class c=Class.forName(input);
		Field field[]=c.getDeclaredFields();
		System.out.println("Fileds are...");
		System.out.println("------------------------------");
		for(Field s:field)
			System.out.println(s);
		Method method[]=c.getDeclaredMethods();
		System.out.println("Method are...");
		System.out.println("------------------------------");
		for(Method s:method)
			System.out.println(s);
		Constructor constructor[]=c.getDeclaredConstructors();
		System.out.println("Constructor are...");
		System.out.println("------------------------------");
		for(Constructor s:constructor)
			System.out.println(s);
		
		
		
	}

}
