import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("You are expected to enter 4-digit number: ");
		
		int number = scan.nextInt(); //	int number = 1234; // 1 + 2 + 3 + 4 = 10
		int numberCopy = number; // System out.print("Sum of " + numberCopy = sum)
		
		int sum = 0; // 4, 3, 2, 1

		sum += number % 10; // sum = sum + number % 10 = 4
		number /= 10; // number = number / 10 = 123 

		sum += number % 10; // 3
		number /= 10; // 12

		sum += number % 10; // 2
		number /= 10; // 1

		sum += number % 10; // 1
		number /= 10; // 0

		System.out.print("SumOfDigits = " + sum); // System.out.println("4-digit number = " + numberCopy)
		


	}
}