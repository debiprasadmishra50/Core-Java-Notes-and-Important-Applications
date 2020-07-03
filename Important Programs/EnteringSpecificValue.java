import java.util.Scanner;

public class EnteringSpecificValue {
	static Scanner sc = new Scanner(System.in);
	static String choice;
	private final static String regex = "[0-9]";
	
	public static void main(String[] args) {
		EnteringSpecificValue.input();
	}

	private static void input() {
		System.out.println("Enter a number");
		choice = sc.next();
	
		if(choice.matches(regex))
		{
			System.out.println(choice);
		}
		else {
			System.out.println("Please Enter a valid Number");
			EnteringSpecificValue.input();
		}
	}
}
