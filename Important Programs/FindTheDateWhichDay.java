package calender;
public class FindTheDateWhichDay 
{
	static java.util.Scanner sc = new java.util.Scanner(System.in);
	static int checkNoOfLeapYear(int yr)
	{
		int lp = 0;
		lp = yr/4;
		return lp;
	}
	static int checkLeapYear(int year)
	{
		if((year%4 == 0 && year%100 != 0) || (year%400 == 0))
			return 1;
		else
			return 0; 
	}
	static void display(int od , int yr , int date , int month , int year)
	{
		int month_Leap[] = {0,31,29,31,30,31,30,31,31,30,31,30,31};
		int month_Norm[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		String week[] = {"Sun","Mon","Tues","Wedness","Thurs","Fri","Satur"};
		
		int days = 0 , i = 0;
		int lp = FindTheDateWhichDay.checkNoOfLeapYear(yr);
		yr = yr-lp; 
		int no = ((lp*2) + yr)%7; 
		od = od+no;
		int leap = FindTheDateWhichDay.checkLeapYear(year);
		if(leap == 1)
		{
			while(i < month) {
				days = days+month_Leap[i];i++;}
			days = days+date;
		}
		else
		{
			while(i < month) {
				days = days + month_Norm[i];i++;}
			days = days+date;
		}
		od = od + (days%7);
		od = od%7;
		System.out.println(date+"-"+month+"-"+year+" was "+week[od]+"Day");
	}
	static void show(int yr, int date, int month , int year)
	{
		if(yr >= 100)
		{
			if(yr>=200)
			{
				if(yr>=300)
				{
					int od = 1;
					yr = yr - 300; 
					FindTheDateWhichDay.display(od, yr , date , month , year);
					return;
				}
				int od = 3;
				yr = yr - 200; 
				FindTheDateWhichDay.display(od, yr, date, month, year);
				return;
			}
			int od = 5;
			yr = yr - 100;
			FindTheDateWhichDay.display(od, yr, date, month, year);
		}
		else
		{
			int od = 0;
			FindTheDateWhichDay.display(od, yr, date, month, year);
		}
	}
	static void checkRange(int year, int month , int date)
	{
		if(year > 1200 && year <= 1600)
		{
			int yr = year - 1201;
			FindTheDateWhichDay.show(yr, date, month, year);
		}
		if(year > 1600 && year <= 2000)
		{
			int yr = year - 1601;
			FindTheDateWhichDay.show(yr, date, month , year);
			
		}
		if(year > 2000 && year <= 2400)
		{
			int yr = year-2001; //124
			FindTheDateWhichDay.show(yr, date, month, year);
		}
	}
	public static void main(String[] args)  
	{
		System.out.println("Enter date");
		int date = sc.nextInt();
		System.out.println("Enter month");
		int month = sc.nextInt();
		System.out.println("Enter Year");
		int year = sc.nextInt();
		FindTheDateWhichDay.checkRange(year , month , date);
	}
}
