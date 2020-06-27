/*
	Decimal to binary
	Decimal to Octal
	Decimal to Hexa-Decimal
	Decimal to String
*/
class Number_Ex
{
	public static void main(String[] args) 
	{
		String a = "50";
		int num = Integer.parseInt(a);
		System.out.println(num);	
		System.out.println(Integer.toBinaryString(num));
		System.out.println(Integer.toOctalString(num));
		System.out.println(Integer.toHexString(num));
		System.out.println(Integer.toString(num));
			
	}
}