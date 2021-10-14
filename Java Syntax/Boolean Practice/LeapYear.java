import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	System.out.print("Year: ");

	int year = scan.nextInt(); // 2021

	boolean isLeap = (year % 4) == 0 && (year % 100) != 0 || (year % 400) == 0; // false && true || false
	
	System.out.println(isLeap ? "Leap year" : "Common year");

	}

}