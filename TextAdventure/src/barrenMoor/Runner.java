package barrenMoor;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {

		PointOfInterest poi = new PointOfInterest();

		System.out.println(
				"You have been abolished from Earth and must find a way back. You look around to find yourself in a baron moor.You see something on the floor in front of you. Try typing north");

		do {
			Movement.Move();
			if (poi.getObject(1).access == true) {
				System.out.println("Distance to closest point of interest: "
						+ itemFunctions.compassDistance(CurrentPosition.getyAxis(), CurrentPosition.getyAxis()) + "m");
			}
			if (poi.getObject(2).access == true) {
				itemFunctions.compassDirection(CurrentPosition.getyAxis(), CurrentPosition.getyAxis());
			}
		} while (poi.getObject(0).access == false);
		

	}

}