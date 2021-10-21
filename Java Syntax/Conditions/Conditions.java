import java.util.Scanner;
import java.util.Random;

public class Conditions {
 
    public static void main(String[] args) {
 
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();

        int x = rnd.nextInt(100); // random number from 0 to 99
        int y = rnd.nextInt(100); // random number from 0 to 99

        int correctAnswer = x + y;
        
        System.out.printf("%d + %d = ", x, y);
        int userAnswer = scan.nextInt();

        // System.out.println(userAnswer == correctAnswer ? "Your answer is incorrect" : "Your answer is incorrect")

        if (correctAnswer == userAnswer) {
            System.out.println("You are correct!");
        } else { // if (correctAnswer != userAnswer) {
            System.out.println("Your answer is incorrect");
            System.out.printf("%d + %d is %d%n", x, y, correctAnswer);
        } 
    }
}