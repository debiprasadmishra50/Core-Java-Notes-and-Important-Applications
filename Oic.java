//Oic.java
package lit.j2me;
//import lit.j2se.*;
public class Oic
{
	public void display()
	{
		lit.j2se.Sbc ob1 = new lit.j2se.Sbc();
		System.out.println("With respect to Oic");
		System.out.println(ob1.a);//+"\t"+ob.b); // b has protected access in Sbc
		System.out.println("-------------------------------------");
	}
}


//javac  	-d 		. 		Oic.java