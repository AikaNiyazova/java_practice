import java.util.Scanner;

public class Turtle {

	static Scanner scan = new Scanner(System.in);
	static String cmd;

	public static void main(String[] args) {
		run();
	}

	public static void run() {

		while (true) {
			System.out.print("Action: ");
			cmd = scan.nextLine().toLowerCase().trim();

			readUserCommand(cmd);

			switch (cmd) {
				case "move":
					move(5);
					break;

				case "turnRight":
					turnRight();
					break;

				case "turnLeft":
					turnLeft();
					break;

				case "stop":
					return;
				}
			}
		}

	public static void move(int steps) {
		System.out.println("Turtle move: " + steps + "steps");
	}

	public static void turnLeft() {
		System.out.println("Turtle turn left");
	}

	public static void turnRight() {
		System.out.println("Turtle turn right");
	}

	public static void readUserCommand() {

		while (true) {
		swith (cmd) {
			case "move":
			case "turnLeft":
			case "turnRight":
			case "stop":
				return;

			default:
				System.out.println("Invalid command: " + cmd);
				
				System.out.print("Try again: ");
				cmd = scan.nextLine();

			}
		}
	}
}