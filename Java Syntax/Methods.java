public class Methods {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int sum = 0;

		for (int i = a; i <= b; i++) {
			sum += i;
		}
		System.out.printf("%d + %d = %d%n", a, b, sum);
	}
	

	public static void main(String[] args) {
		findSum(10, 20);
		findSum(25, 33);
		findSum(45, 74);
	}

	public static void findSum() {
		int sum = 0;
		for (int i = 10; i < 20; i++) {
			sum += i;
		}
		System.out.printf("%d + %d = %d%n", a, b, sum);
	}
}