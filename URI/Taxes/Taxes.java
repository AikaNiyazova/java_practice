import java.util.Scanner;

public class Taxes {
 
    public static void main(String[] args) {
 
        Scanner scan = new Scanner(System.in);
        
        double number = scan.nextDouble();
        double tax1 = (number - 2000.00) * 0.08;
        double tax2 = (number - 3000.00) * 0.18;
        double tax3 = (number - 4500.00) * 0.28;
        
        if (number <= 2000.00) {
            System.out.println("Isento");
        }
        else if (number > 2000.00 && number <= 3000.00) {
            System.out.printf("R$ %.2f%n", tax1);
        }
        else if (number > 3000.00 && number <= 4500.00) {
            System.out.printf("R$ %.2f%n", tax1 + tax2);
        }
        else {
            System.out.printf("R$ %.2f%n", tax1 + tax2 + tax3);
        }
 
    }
 
}