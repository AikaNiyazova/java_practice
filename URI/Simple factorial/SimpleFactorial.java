import java.util.Scanner;
public class SimpleFactorial {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int factorial = 1;
		
		if (n > 0 && n < 13) {
			for (int i = n; i >= 1; i--) {
				factorial *= i;
			}
			System.out.println(factorial);
		}
	}
}