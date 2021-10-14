import java.util.Scanner;

public class Swapping {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("a: ");
		int a = scan.nextInt(); //a = 3

		System.out.print("b: ");
		int b = scan.nextInt(); //b = 2

		System.out.println("Before swapping: a = " + a + ", b = " + b);

		int temp = a;
		a = b;
		b = temp;

		System.out.println("After swapping: a = " + a + ", b = " + b);

		/*
		Старый вариант:
		a = a + b;
		b = a - b;
		a = a - b;

		import java.until.Scanner;
		*/


	}
}