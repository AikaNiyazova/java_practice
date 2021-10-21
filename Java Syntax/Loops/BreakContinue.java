import java.util.Random;

public class BreakContinue {
 
    public static void main(String[] args) {
 
        Random rnd = new Random();

        int counter = 0;
        while (true) {
        	int number = rnd.nextInt(100);
        	if (number < 80 && number % 2 == 0) {
        		break;
        	}
        	else if (number > 80 && number % 2 != 0) {
        		System.out.println(++counter + ". Closer..."); // ++counter -> starts with 1; counter ++ -> starts with 0
        		continue;
        	}
        	System.out.println(==counter + ". Still inside...");
        }
    }
}