// sum of digits, if greater than 10 add again the digits untill get a single digit
public class SumDigitsUntillSingleDigit {
	 static int digSum(int n) 
	    { 
	        int sum = 0; 
	        while (n > 0 || sum > 9)  
	        { 
	            if (n == 0) { 
	                n = sum; 
	                sum = 0; 
	            } 
	            sum += n % 10; 
	            n /= 10; 
	        } 
	        return sum; 
	    } 
	      
	  
	    public static void main(String args[]) 
	    { 
	    	java.util.Scanner sc = new java.util.Scanner(System.in);
	    	System.out.println("Enter the number");
			int n = sc.nextInt();
	       
	        System.out.println(digSum(n)); 
	    } 
}
