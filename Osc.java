//Osc.java
package lit.j2ee;
public class Osc extends lit.j2se.Sbc
{
	public void display()
	{
		System.out.println("With respect to Osc");
		System.out.println(a+"\t"+b);//+"\t"+c); //c is not public in Sbc; cannot be accessed from outside package
		System.out.println("-------------------------------------");
	}
}


//javac  	-d 		. 		Osc.java