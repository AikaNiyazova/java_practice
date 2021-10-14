import java.util.Scanner;

public class Variables {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// типДанных название = значение;
		System.out.print("Fullname: ");
		String fullname = scan.nextLine();

		System.out.print("Age: ");
		int age = scan.nextInt();

		char gender = 'M';
		
		System.out.print("Is student: ");
		boolean isStudent = scan.nextBoolean();
		
		System.out.print("Inn: ");
		long inn = scan.nextLong();

		float height = 170.1F;
		double weight = 70.6;

		System.out.println("His name is " + fullname);
		System.out.println("His age is " + age);
		System.out.println("He's " + gender);
		System.out.println("Is he student? " + isStudent);
		System.out.println("INN = " + inn);
		System.out.println("He's " + height + " meters tall");
		System.out.println("His weight is " + weight);



	}
}