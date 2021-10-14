import java.util.Scanner;

public class Arithmetic {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a, b;
		// int;

		System.out.print("a: ");
		a = scan.nextInt(); //5

		System.out.print("b: ");
		b = scan.nextInt(); //6

		// + для текста -> конкатенация
		// + -> арифметическое сложение

		System.out.println(a + " + " + b + " = " + (a + b)); // 5 + 6 = 11
		System.out.println(a + " - " + b + " = " + (a - b));
		System.out.println(a + " * " + b + " = " + (a * b));
		System.out.println(a + " / " + b + " = " + (a / b));
		System.out.println(a + " % " + b + " = " + (a % b));
	}
}