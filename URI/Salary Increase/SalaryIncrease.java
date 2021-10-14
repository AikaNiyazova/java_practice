import java.util.Scanner;

public class SalaryIncrease {
 
    public static void main(String[] args) {
 
        Scanner scan = new Scanner(System.in);
        
        double number = scan.nextDouble();
        
        if (number <= 400.00) {
            System.out.printf("Novo salario: %.2f%n", number + number * 0.15);
            System.out.printf("Reajuste ganho: %.2f%n", number * 0.15);
            System.out.println("Em percentual: 15 %");
        }
        else if (number > 400 && number <= 800.00) {
            System.out.printf("Novo salario: %.2f%n", number + number * 0.12);
            System.out.printf("Reajuste ganho: %.2f%n", number * 0.12);
            System.out.println("Em percentual: 12 %");
        }
        else if (number > 800.00 && number <= 1200.00) {
            System.out.printf("Novo salario: %.2f%n", number + number * 0.1);
            System.out.printf("Reajuste ganho: %.2f%n", number * 0.1);
            System.out.println("Em percentual: 10 %");
        }
        else if (number > 1200.00 && number <= 2000.00) {
            System.out.printf("Novo salario: %.2f%n", number + number * 0.07);
            System.out.printf("Reajuste ganho: %.2f%n", number * 0.07);
            System.out.println("Em percentual: 7 %");
        }
        else {
            System.out.printf("Novo salario: %.2f%n", number + number * 0.04);
            System.out.printf("Reajuste ganho: %.2f%n", number * 0.04);
            System.out.println("Em percentual: 4 %");
        }
 
 
    }
 
}