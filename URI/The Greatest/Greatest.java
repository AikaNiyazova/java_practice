import java.util.Scanner;
 
public class Greatest {
 
    public static void main(String[] args) {
 
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        int x = (a + b + Math.abs(a -b)) / 2;
        int result = (x + c + Math.abs(x - c)) / 2;
        
        System.out.println(result + " eh o maior");
    }
 
}