class Demo
{
	static Object show()
	{
		//return 10;
		//return 1.0;
		//return "Hello";
		return new Demo();
		// It can retrn anything.

	}
	public static void main(String[] args) 
	{
		//Demo d = show();// Object cannot be converted to demo
		Demo d = (Demo) show();
		System.out.println(show());	
	}
}