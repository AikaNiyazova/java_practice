import java.uti.Scanner;

public class DaysInYear {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the numeric value of the month: ");
		int month = scan.nextInt();
		
		System.out.println("Enter the year: ");
		int year = scan.nextYear();

		int day; // мусор

		if (month == 1 ||
			month == 3 ||
			month == 5 ||
			month == 7 ||
			month == 8 ||
			month == 10 ||
			month == 12)

		boolean isLeap = (year % 4) == 0 && (year % 100) != 0 || (year % 400) == 0;
		int leapYear = isLeap ? 29 : 28;

		switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				day = 31;
				break;

			case 4:
			case 6:
			case 9:
			case 11:
				day = 30;
				break;

			case 2:
				day = isLeap ? 29 : 28;
				break;

			default:
				day = -1;
		}

		if (day == -1) {
			System.out.println("Invalid month: " + month);
		} else {
			System.out.println("Days: " + day);
		}
		
	}
}

