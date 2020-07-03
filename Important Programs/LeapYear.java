package calender;

public class LeapYear 
{
	static java.util.Scanner sc = new java.util.Scanner(System.in);
	static void checkLeap(int year)
	{
		if((year%4 == 0 && year%100 != 0) || (year%400 == 0))
			System.out.println(year+" is a leap year");
		else
			System.out.println(year+" is not a leap year");
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter year");
		int year = sc.nextInt();
		LeapYear.checkLeap(year);
	}
}
