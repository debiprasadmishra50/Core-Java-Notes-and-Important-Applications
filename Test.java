class Demo
{
	Demo(int x)
	{
		System.out.println("Demo : constructor");
	}
}
class Test extends Demo
{
	Test()
	{
		super(123);
		System.out.println("Test : constructor");	
	}
	public static void main(String[] args) 
	{
		new Test();
	}
}
// Demo : constructor
// Test : constructor
