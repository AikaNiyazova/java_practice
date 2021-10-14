import java.util.Scanner;

public class ShowCurrentTime {
	public static void main(String[] args) {
		
		// Scanner scan = new Scanner(System.in);
		long milliseconds = System.currentTimeMillis(); // от 1 января 1970 в миллисекундах

		// Общее время в секундах с 1 января 1970
		long totalSeconds = milliseconds / 1000; // 1000 % 60

		// Текущие секунды
		long currentSecond = totalSeconds % 60;

		// Общие время в минутах
		long totalMinutes = totalSeconds / 60;

		// Текущие минуты
		long currentMinute = totalMinutes % 60;

		// Общее время в часах
		long totalHours = totalMinutes / 60;

		// Текущие часы
		long currentHour = totalHours % 24 + 6L;

		System.out.printf("Current time is %d:%d:%d%n", currentHour, currentMinute, currentSecond);

		long totalDays = totalHours / 24;
		double currentDay = totalDays % 30.4375;

		double totalMonths = totalDays / 30.4375;
		double currentMonth = totalMonths % 12;

		double totalYears = totalMonths / 12;
		
		System.out.printf("Current time is Year %f Month %.0f Day %.0f %d.%d.%d%n", 
			totalYears + 1970,
			currentMonth,
			currentDay, 
			currentHour, 
			currentMinute, 
			currentSecond);

	}

}
		