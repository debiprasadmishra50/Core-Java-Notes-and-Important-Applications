// Moreover Lambda expresson is replacement of Anonymous Class in Java
interface A
{
	void show();
}
interface B //extends A
{
	// void show();
	void multiply(int a , int b);
}
class Test 
{
	// public void show()
	// {
	// 	System.out.println("show() in Test");
	// }
	public static void main(String[] args) 
	{
		// A a = new A(){
		// 	public void show()
		// 	{
		// 		System.out.println("show in Test$1");
		// 	}
		// };
		// a.show();
		// new Test().show();
		A x = () -> System.out.println("show using Lambda");
		x.show();

		
		B mul = (a , b) -> System.out.println(a*b); 
		mul.multiply(10 , 20);
	}
}