import java.util.Scanner;
public class Pum {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int a = 1;
		int b = 2;
		int c = 3;

		for (int i = 0; i < n; i++) {
			System.out.printf("%d %d %d PUM%n", a, b, c);
			a += 4;
			b += 4;
			c += 4;

		}
	}
}