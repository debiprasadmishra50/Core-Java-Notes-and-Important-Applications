//AccessTest
package core.java.Student;
import lit.j2se.*;
import lit.j2ee.Osc;
import lit.j2me.Oic;

public class AccessTest
{
	public static void main(String[] args) 
	{
		new Sbc() . display();
		new Ssc() . display();
		new Sic() . display();	
		new Osc() . display();
		new Oic() . display();

	}
}


//javac 	-d 	. 	AccessTest.java
//java core.java.Student.AccessTest