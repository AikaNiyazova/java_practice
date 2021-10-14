import java.util.Scanner;

public class BanknotesAndCoins {
 
    /*public static void main(String[] args) {
 
        Scanner scan = new Scanner(System.in);
        
        double money = scan.nextDouble();
        // System.out.println(money);
        
        System.out.println("NOTAS:");
        System.out.printf("%d nota(s) de R$ 100.00%n", (int)money / 100);
        money %= 100;
        System.out.printf("%d nota(s) de R$ 50.00%n", (int)money / 50);
        money %= 50;
        System.out.printf("%d nota(s) de R$ 20.00%n", (int)money / 20);
        money %= 20;
        System.out.printf("%d nota(s) de R$ 10.00%n", (int)money / 10);
        money %= 10;
        System.out.printf("%d nota(s) de R$ 5.00%n", (int)money / 5);
        money %= 5;
        System.out.printf("%d nota(s) de R$ 2.00%n", (int)money / 2);
        money %= 2;
        
        double coins = money * 100;
        
        System.out.println("MOEDAS:");
        System.out.printf("%d moeda(s) de R$ 1.00%n", (int)coins / 100);
        coins %= 100;
        System.out.printf("%d moeda(s) de R$ 0.50%n", (int)coins / 50);
        coins %= 50;
        System.out.printf("%d moeda(s) de R$ 0.25%n", (int)coins / 25);
        coins %= 25;
        System.out.printf("%d moeda(s) de R$ 0.10%n", (int)coins / 10);
        coins %= 10;
        System.out.printf("%d moeda(s) de R$ 0.05%n", (int)coins / 5);
        coins %= 5;
        System.out.printf("%d moeda(s) de R$ 0.01%n", (int)coins / 1);
        coins %= 1;
 
    }
 
}

class BanknotesAndCoins2 {
*/
    public static void main(String[] args) {
 
        Scanner scan = new Scanner(System.in);
        
        double total = scan.nextDouble(); //234.32
        
        int notas = (int) total; // 234
        int moedas = (int) (100 * (total - notas)); // 32
        
        System.out.println("NOTAS:");
        System.out.printf("%d nota(s) de R$ 100.00%n", notas / 100);
        notas %= 100;
        System.out.printf("%d nota(s) de R$ 50.00%n", notas / 50);
        notas %= 50;
        System.out.printf("%d nota(s) de R$ 20.00%n", notas / 20);
        notas %= 20;
        System.out.printf("%d nota(s) de R$ 10.00%n", notas / 10);
        notas %= 10;
        System.out.printf("%d nota(s) de R$ 5.00%n", notas / 5);
        notas %= 5;
        System.out.printf("%d nota(s) de R$ 2.00%n", notas / 2);
        notas %= 2;
        
        System.out.println("MOEDAS:");
        System.out.printf("%d moeda(s) de R$ 1.00%n", notas);
        System.out.printf("%d moeda(s) de R$ 0.50%n", moedas / 50);
        moedas %= 50;
        System.out.printf("%d moeda(s) de R$ 0.25%n", moedas / 25);
        moedas %= 25;
        System.out.printf("%d moeda(s) de R$ 0.10%n", moedas / 10);
        moedas %= 10;
        System.out.printf("%d moeda(s) de R$ 0.05%n", moedas / 5);
        moedas %= 5;
        System.out.printf("%d moeda(s) de R$ 0.01%n", moedas);
 
    }
 
}