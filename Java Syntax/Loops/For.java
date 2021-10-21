import java.util.*; // вытаскиваем всю библиотеку util

public class For {
 
    public static void main(String[] args) {
 
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();

        System.out.print("Nmuber of tests: ");
        int testsCount = scan.nextInt();
        int Trials = 1;

        for (int i = 0; i < testsCount; i++) {
            int x = 50 + rnd.nextInt(10); // 0-9 -> 50-59   x = 1
            int y = 50 + rnd.nextInt(10); // 0-9 -> 50-59   y = 2

            int correctAnswer = x + y;    //    correctAnswer = 3

            /*
            System.out.printf("%d + %d = ? Answer: ", x, y);
            int answer = scan.nextInt();

            if (answer != correctAnswer) {
                System.out.printf("Incorrect!%n%d + %d = %d%n", x, y, correctAnswer);
            } else {
                System.out.println("Correct");
            }
            System.out.println(); // пустая строка после каждого теста
            */


            while (true) {
                System.out.printf("%d + %d = ? Answer: ", x, y);
                int answer = scan.nextInt(); // answer = 2

                if (answer == correctAnswer) { // 2 == 3 -> false
                    break;
                }
                System.out.println("Incorrect! Try again..."); // running
                Trials++; // Trials = 1
            }

            System.out.println("Correct");
            System.out.println("Trials: " + Trials);

        }
    }
}