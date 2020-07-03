package lit;

public class MethodsOfStringBuffer {

	public static void main(String[] args) 
	{
		StringBuffer sb1 = new StringBuffer("Hello");
		StringBuilder sb2 = new StringBuilder("Hello");
		
		System.out.println(sb1);
		
		System.out.println(sb1.length());
		System.out.println(sb1.insert(0, "Hi "));
		System.out.println(sb1);
		System.out.println(sb1.delete(0, 2));
		System.out.println(sb1.replace(1, 3, " java "));
		System.out.println(sb1.append(" LIT"));
		System.out.println(sb1.reverse());
		
		System.out.println("----------------------------------------------");
		
		
		System.out.println(sb2);
		
		System.out.println(sb2.length());
		System.out.println(sb2.insert(0, "Hi "));
		System.out.println(sb2);
		System.out.println(sb2.delete(0, 2));
		System.out.println(sb2.replace(1, 3, " java "));
		System.out.println(sb2.append(" LIT"));
		System.out.println(sb2.reverse());
		
		System.out.println("we get same output for StringBuilder as well as for StringBuffer");

	}

}
