//Sbc.java
package lit.j2se;
public class Sbc
{
	public int a = 10;
	protected int b = 20;
	int c = 30;
	private int d = 40;

	public void display()
	{
		System.out.println("With respect to Sbc");
		System.out.println(a+"\t"+b+"\t"+c+"\t"+d);
		System.out.println("-------------------------------------");
	}

}


//javac  	-d 		. 		Sbc.java