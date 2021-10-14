import java.util.Scanner;

public class Inch {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		final double INCH_TO_CM = 2.54;

		int inch = scan.nextInt();

		double result = inch * INCH_TO_CM;

		System.out.printf("%d in. = %.2f cm.%n", inch, result);
	}
}