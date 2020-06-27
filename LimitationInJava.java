package test;

//class A
//{
//	public static void show() {
//		System.out.println("show in A");
//	}
//}
public class LimitationInJava
{
//	public static void show()
//	{
//		System.out.println("show in Test");
//	}
	public static void main(String[] args) throws Exception 
	{
//		A a = new Test();
//		a.show();
		
//		
		System.out.println("Program started");
		
		try{
			throw new Exception();
		}
		catch(Exception e)
		{
			System.out.println("Exception handled in main");
			System.out.println("exception thrown again");
			throw e; //Exception generation code
		}
		finally
		{
			System.out.println("finally block started");
			System.exit(0);
			System.out.println("Program Terminated Normally");
		}
//		System.out.println("Unreachable statement");
		
//		System.out.println("No compilation error");
	}
}
