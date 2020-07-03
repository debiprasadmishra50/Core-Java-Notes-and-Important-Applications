package lit;

public class StringBuffer_1 {

	public static void main(String[] args) {
		
		// faster vs slower
		
		long start ,stop;
		StringBuffer sb1 = new StringBuffer("Hello");
		System.out.println(sb1);
		start = System.currentTimeMillis();
		for (int i = 0; i <= 20000; i++) 
		{
			sb1.append(""+i);
			
		}
		stop = System.currentTimeMillis();
		System.out.println("time taken by StringBuffer "+(stop-start));
		
		System.out.println("--------------------------");
		
		
		String s1 = new String ("Hello");
		System.out.println(s1);
		start = System.currentTimeMillis();
		for (int i = 0; i <= 20000; i++) 
		{
			s1 = s1.concat(""+i);
			
		}
		stop = System.currentTimeMillis();
		System.out.println("time taken by string is "+(stop-start));
		
		

	}

}
