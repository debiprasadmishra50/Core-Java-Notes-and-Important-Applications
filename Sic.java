//Sic.java
package lit.j2se;
public class Sic
{
	public void display()
	{
		Sbc ob = new Sbc();
		System.out.println("With respect to Sic");
		System.out.println(ob.a+"\t"+ob.b+"\t"+ob.c);//+"\t"+d); // d has private access in Sbc
		System.out.println("-------------------------------------");
	}
}

//javac  	-d 		. 		Sic.java