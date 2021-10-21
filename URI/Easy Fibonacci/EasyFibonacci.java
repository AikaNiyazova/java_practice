import java.util.Scanner;
public class EasyFibonacci {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt(); //5
		int a = 0;
		int b = 1;
		int c = a + b;

		if (n > 0 && n < 46) {
			if (n == 1) {
				System.out.print(a);
			}
			else if (n == 2) {
				System.out.print(a + " " + b);
			}
			else {
				System.out.print(a + " " + b);
				for (int i = 2; i < n; i++) {
					c = a + b;
					System.out.print(" " + c);
					a = b;
					b = c;
					
				}
			
			}
		}
		System.out.println();
	}
}