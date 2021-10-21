import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		
		int test = scan.nextInt();
		
		for(int i = 0; i < test; i++) {
			int number = scan.nextInt();
			System.out.println(number + (isPrime(number) ? " eh primo" : " nao eh primo"));
		}
		
	}
	public static boolean isPrime (int number) {
		int divisors = 0;
			for(int j = 1; j <= number; j++) {
				if(number % j == 0) {
					divisors++;
				}
			}
			return divisors == 2;
	}
}