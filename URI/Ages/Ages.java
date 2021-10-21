import java.util.Scanner;
public class Ages {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		
		int age;
		double count = 0;
		double sum = 0;

		while (true) {
			age = scan.nextInt();
			if (age >= 0) {
				count++;
				sum += age;
			}
			else {
				break;
			}
		}
		System.out.printf("%.2f%n", sum / count);
	}
}