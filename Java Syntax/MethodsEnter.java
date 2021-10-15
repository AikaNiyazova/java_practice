import java.util.Scanner;

public class MethodsEnter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int max = findMax(a, b);
			print(max);
		}
	}

	public static int findMax(int a, int b) {
		if (a >= b) {
			return a;
		}
		return b;
	}	

	public static void print(int res) {
		System.out.println("Result: " + res);
	}
}