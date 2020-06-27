//Ssc.java
package lit.j2se;
public class Ssc extends Sbc
{
	public void display()
	{
		System.out.println("With respect to Ssc");
		System.out.println(a+"\t"+b+"\t"+c);//+"\t"+d); // d has private access in Sbc
		System.out.println("-------------------------------------");
	}
}


//javac  	-d 		. 		Ssc.java