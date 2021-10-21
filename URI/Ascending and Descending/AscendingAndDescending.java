import java.util.Scanner;
public class AscendingAndDescending {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		int y = scan.nextInt();

		System.out.println(order(x, y));
	}
	
	static String order(int x, int y) {

		while (true) {

			if (x < y)
				return "Crescente";
			else if (x > y)
				return "Decrescente";
			else
				break;

		}
	}
}