import java.util.Scanner;

public class BooleanPractice {
	public static void main(String[] args) {
		
		/* String name = "Jack";
		boolean isStudent = true;
		System.out.println("Is Jack student& " + isStudent); */

		//System.out.println((int) (Math.random() * 10) + ":" + (int) (Math.random() * 10) // System.out.println(System.currentTimeMillis() % 10 + ":" + System.currentTimeMillis() %7);

		Scanner scan = new Scanner(System.in);

		int x = (int) (Math.random() * 10);
		int y = (int) (Math.random() * 10);

		System.out.printf("%d + %d = ", x, y);
		int answer = scan.nextInt();

		boolean isCorrect = answer == (x + y);

		String answerCorrect = String.format("%d + %d is %d? %b", x, y, answer, isCorrect);
		String answerIncorrect = String.format("%d + %d is %d? %b. Correct answer is %d.", x, y, answer, isCorrect, (x + y));

		System.out.println(isCorrect ? answerCorrect : answerIncorrect);
		// System.out.println(boolean ? true : false)
		
		// System.out.printf("%d + %d is %d? %b", x, y, answer, isCorrect);
		// System.out.printf("Your answer is %b.", x + y == answer);

		/* Операторы сравнения
		>
		<
		==
		>=
		<=
		!=
		Каждый из них генерирует boolean значение: либо true, либо false
		*/

		
	}
}