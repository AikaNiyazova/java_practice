import java.util.Scanner;

public class Conditions {
 
    public static void main(String[] args) {
 
        Scanner scan = new Scanner(System.in);
                
        System.out.print("Weight: ");
        double weight = scan.nextDouble();

        System.out.print("Height in meters: ");
        double height = scan.nextDouble();

        double bmi = weight / Math.pow(height, 2);

        System.out.println(bmi);

        if (bmi < 18.5) System.out.println("Underweight");
        else if (bmi < 25) System.out.println("Normal");
        else if (bmi < 30) System.out.println("Overweight");
        else System.out.println("Obese");
        
    }
}