import java.util.InputMismatchException;

public class ExceptionHandling 
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Program Strarted");
		
//		System.out.println("Enter a number");
		
		try
		{
//			int no = sc.nextInt();
//			System.out.println(10/no);
			System.out.println(Integer.parseInt(args[0])/Integer.parseInt(args[1]));
		}
		catch(InputMismatchException e)
		{
			System.out.println("InputMismatchException Caught");
		}
		catch(NumberFormatException e)
		{
			System.out.println("NumberFormatException caught");
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException caught");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException caught");
		}
		catch(Throwable e)
		{
			System.out.println("");
		}
		
		sc.close();
		
		System.out.println("Program Terminated Normally");
	}
}
