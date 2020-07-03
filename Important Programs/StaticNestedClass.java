public class StaticNestedClass
{
	static void show()
	{
		System.out.println("show in Test");
	}
	protected static class A
	{
		public static void show()
		{
			System.out.println("show in A");
		}
	}
	public static void main(String[] args) 
	{
		// new Test().new A().show(); //Error  file does not contain class Test Please remove or make sure it appears in the correct subdirectory of the sourcepath.
		// Test.A.Show(); // Error  file does not contain class Test Please remove or make sure it appears in the correct subdirectory of the sourcepath.
		A.show();
		new A().show();
	}
}
// class Demo
// {
// 	public static void main(String[] args) {
// 		new Test().new A().show();
// 	}
// }

// javac Test.java
// java Test
// java Demo