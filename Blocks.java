package test;

public class Blocks 
{
	static java.util.Scanner sc = new java.util.Scanner(System.in);
	Blocks()
	{
		System.out.println("Constructor");
	}
	void show()
	{
		
	}
	void display()
	{
		System.out.println("display() in Test");
		show();
//		System.out.println("OK");
		{
			System.out.println("non-static inside display()");
		}
	}
	static{
		System.out.println("Inside Static block");
		new Blocks().display();
		
		{
			System.out.println("non-static block inside static block");
		}
	}
	
	{
		System.out.println("Outside non-static block ");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Inside main()");
//		System.out.println("Program Started");
//		
//		System.out.println("Program Termminated Successfully");
//		
		{
			System.out.println("Inside non-static block");
			new Blocks().display();
		}
	}
}
