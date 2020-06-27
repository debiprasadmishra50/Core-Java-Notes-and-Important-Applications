// It can store a number of any number of digits.

class BigIntegerOperation
{
	public static void main(String[] args) 
	{
		java.math.BigInteger no = new java.math.BigInteger (args[0]);

		java.math.BigInteger no1 = new java.math.BigInteger (args[1]);

		System.out.println(no.add(no1));
		System.out.println(no.subtract(no1));
		System.out.println(no.multiply(no1));
		System.out.println(no.divide(no1));
	}
}