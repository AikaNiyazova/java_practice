import java.util.Scanner;

public class While {
 
    public static void main(String[] args) {
 
        Scanner scan = new Scanner(System.in);

        int count = 0; //initialization
        int positiveCounter = 0;
        
        while (count < 6) { // check condition
            double number = scan.nextDouble();

            if (number > 0) {
                positiveCounter++;
            }

            count++; // сторож
        }
        System.out.println(positiveCounter + " valores positivos");


        /*
        System.out.print("Number: ");
        int number = scan.nextInt(); // 1234
        int sum = 0;

        while (number != 0) {
            sum += number % 10; // 4
            number /= 10; // 123
        }
        System.out.println(sum);
        */


        /* 
        int count = 2;
        while (count <= 100) {
            System.out.println(count);
            count += 2;
        } 
        */
    
        
        /* 
        System.out.println("Before loop");
        while (count < 100) { //check condition
            // count++; // 1-100
            System.out.println(count + ". Hello, World!");
            count++; // 0-99
            }
            System.out.println("After loop"); 
        */
    }
}