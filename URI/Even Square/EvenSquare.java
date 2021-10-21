import java.util.Scanner;
public class EvenSquare {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		if (n > 5 && n < 2000) {
			for (int i = 2; i <= n; i += 2) {
				System.out.println(i + "^2 = " + i * i);
				//System.out.printf("%d^2 = %d%n", i, i * i);
				}
		}
	}
}