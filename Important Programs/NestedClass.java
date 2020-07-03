public class NestedClass
{
	static void show()
	{
		System.out.println("show in Test");
	}
	protected class A
	{
		public void show()
		{
			System.out.println("show in A");
		}
	}
	public static void main(String[] args) 
	{
		new Test().new A().show();
	}
}
class Demo
{
	public static void main(String[] args) {
		new Test().new A().show();
	}
}

// javac Test.java
// java Test
// java Demo