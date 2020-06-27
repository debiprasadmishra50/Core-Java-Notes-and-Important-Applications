class CheckEven
{
	public static void main(String[] args) 
	{
		int no = Integer.parseInt(args[0])	;
		if(no %2 == 0)
			System.out.println("EVEN");
		else
			System.out.println("Odd");
	}
}