package barrenMoor;

import java.util.Scanner;

public class Movement extends CurrentPosition {

	public Movement(double xAxis, double yAxis) {
		super(xAxis, yAxis);

	}

	public static void Move() {
		System.out.println("\nWhich way would you like to go?");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		if (input.matches("north")) {
			// move north
			setyAxis(getyAxis() + 1);
			System.out.println("Current position: " + getxAxis() + "," + getyAxis());
			GameEvents.checkItemFound();

		} else if (input.matches("east")) {
			// move east
			setxAxis(getxAxis() + 1);
			System.out.println("Current position: " + getxAxis() + "," + getyAxis());
			GameEvents.checkItemFound();

		}

		else if (input.matches("south")) {
			setyAxis(getyAxis() - 1);
			System.out.println("Current position: " + getxAxis() + "," + getyAxis());
			GameEvents.checkItemFound();

		} else if (input.matches("west")) {
			// move west
			setxAxis(getxAxis() - 1);
			System.out.println("Current position: " + getxAxis() + "," + getyAxis());
			GameEvents.checkItemFound();

		} else {
			System.out.println("Can you not spell?");

		}

	}

	public static double currentxPosition() {
		return getxAxis();
	}

	public static double currentyPosition() {
		return getyAxis();
	}

}
