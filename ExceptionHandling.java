package test;

public class ExceptionHandling 
{
	void show() throws Exception 
	{
		System.out.println("show()");
		try{
			
			try{
				throw new Exception();
			}catch (Exception e) {
				System.out.println("User-defined exception");
			}
			
			try {
				throw new RuntimeException();
			}
			catch (Exception e) {
				System.out.println("Runtime Exception");
			}
			
			 throw new Exception(); //No one is catching this
		}
		catch (Exception e) {
			System.out.println("Exception handled by show()");
			try{
				throw e;
			}
//			catch (Exception ee) {
//				System.out.println("throw exception of show() handled here only");
//			}
			finally {
				System.out.println("finally inside show");
			}
		}
	}
	void display() throws Exception
	{
		System.out.println("display() method");
		show();
		System.out.println("Ok");
	}
	public static void main(String[] args) throws Exception 
	{
		System.out.println("Program started");
//		try
//		{
//			new Test().display();
//		}
//		catch (Exception e) {
//			System.out.println("Exception handled by main");
//		}
		try{
			new ExceptionHandling().display();
		}
		catch(Exception e)
		{
			System.out.println("show() Exception handled in main");
			System.out.println("exception thrown again");
			throw e; //Exception generation code
		}
		
		finally{
			System.out.println("finally block started");
			System.exit(0);
			System.out.println("Program Terminated Normally");
		}
	}
}
