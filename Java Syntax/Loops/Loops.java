import java.util.Scanner;

public class Loops {
 
    public static void main(String[] args) {
 
        Scanner scan = new Scanner(System.in);

        int count = 0; //initialization
        int positiveCounter = 0; // 1060
        
        while (count < 6) {
            double number = scan.nextDouble();

            if (number > 0) {
                positiveCounter++;
            }

            count++;
        }
        System.out.println(positiveCounter + " valores positivos");


        /* while (count <= 100) {
            System.out.println(count);
            count += 2;
        } */
    }
}
        


        /* System.out.println("Before loop");
        while (count < 100) { //check condition
            count++;
            System.out.println(count + "")} */