import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int counter = 0;
		int number; // мусор

		do {
			number = counter++;
		}
		while (counter > 0); // max int value
		// while (counter < 0); // 0
		System.out.println(number);
	}
}