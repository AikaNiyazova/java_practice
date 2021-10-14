import java.util.Scanner;

public class BhaskarasFormula {
 
    public static void main(String[] args) {
 
        Scanner scan = new Scanner(System.in);
        
        double a = scan.nextDouble();//1
        double b = scan.nextDouble();//5
        double c = scan.nextDouble();//3

        /* double disc = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
        
        if (a != 0 && disc >= 0) {
            double r1 = (-b + disc / 2 * a);
            double r2 = (-b - disc / 2 * a);

            System.out.printf("R1 = %.5f%n", r1);
            System.out.printf("R2 = %.5f%n", r2);
        } 
        else {
            System.out.println("Impossivel calcular");
        } */
       
        double r1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        double r2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        
        if (a != 0 && (Math.pow(b, 2) - 4 * a * c) >= 0) {
             System.out.printf("R1 = %.5f%n", r1);
             System.out.printf("R2 = %.5f%n", r2);
        } else {
            System.out.println("Impossivel calcular");
        }
    }
 
}