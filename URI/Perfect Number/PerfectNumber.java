import java.util.Scanner;
public class PerfectNumber {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		
		int test = scan.nextInt();

		for(int i = 0; i < test; i++) {
			int number = scan.nextInt();
			int sum = findSum(number);
			System.out.println(number + (isPerfect(number,sum) ? " eh perfeito" : " nao eh perfeito"));
		
		}	
	}

	public static int findSum(int number) {
		int sum = 0;
		for(int i = 1; i < number; i++) {
			if(number % i == 0) {
				sum += i;
			}
		}
		return sum;
	}

	public static boolean isPerfect(int number, int sum) {
		return number == sum;
	}
}