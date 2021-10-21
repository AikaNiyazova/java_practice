import java.util.Scanner;

public class PositivesAndAverage {
 
    public static void main(String[] args) {
 
        Scanner scan = new Scanner(System.in);
        int loopCounter = 0;
        int positivesCounter = 0;
        double positivesSum = 0;

        while (loopCounter++ < 6) {
            double number = scan.nextDouble();

            if (number > 0) {
                positivesCounter++;
                positivesSum += number;
            }
        }
        System.out.println(positivesCounter + " valores positivos");
        // if (positivesCounter > 0) { // чтобы отсеять кейсы, если пользователь вводит все числа меньше 0
            System.out.printf("%.1f%n", positivesSum / positivesCounter);
        //}
        
    }
}   