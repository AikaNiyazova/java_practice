import java.util.Scanner;

public class DistanceBetweenTwoPoints {
 
    public static void main(String[] args) {
 
        Scanner scan = new Scanner(System.in);
        
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        
        double x = x2 - x1;
        double y = y2 - y1;
        double z = 2;
        System.out.printf("%.4f%n", Math.sqrt(Math.pow(x, z) + Math.pow(y, z)));
        // double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1))
 
    }
 
}