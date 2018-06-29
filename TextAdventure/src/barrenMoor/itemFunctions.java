package barrenMoor;

import java.util.ArrayList;

public class itemFunctions {

	ArrayList poi = PointOfInterest.getPoi();

	public static float compassDistance(double a, double b) {
		float distance = 1000;

		for (Objects o : PointOfInterest.getPoi()) {
			if (o.access == false) {
				// calculate the distance to closest object
				Objects x;
				if (Math.sqrt((o.xAxis - a) * (o.xAxis - a) + (o.yAxis - b) * (o.yAxis - b)) < distance)
					distance = (float) Math.sqrt((o.xAxis - a) * (o.xAxis - a) + (o.yAxis - b) * (o.yAxis - b));
				x = o;
			}

		}
		return distance;

	}

	public static void compassDirection(double a, double b) {
		float distance = 1000;

		for (Objects o : PointOfInterest.getPoi()) {
			if (o.access == false) {
				// calculate the distance to closest object
				Objects x;
				if (Math.sqrt((o.xAxis - a) * (o.xAxis - a) + (o.yAxis - b) * (o.yAxis - b)) < distance)
					distance = (float) Math.sqrt((o.xAxis - a) * (o.xAxis - a) + (o.yAxis - b) * (o.yAxis - b));
				x = o;

				if (o.xAxis - a == 0) {
					if (o.yAxis - b > 0) {
						System.out.println("Go North");

					} else
						System.out.println("Go South");
				}

				else if (o.yAxis - b == 0) {
					if (o.xAxis - a > 0) {
						System.out.println("Go East");

					} else
						System.out.println("Go West");
				}

				else if (o.xAxis - a > 0) {
					if (o.yAxis - b > 0) {
						System.out.println("Go North East");

					} else
						System.out.println("Go South East");
				}

				else if (o.xAxis - a < 0) {
					if (o.yAxis - b > 0) {
						System.out.println("Go North West");

					} else
						System.out.println("Go South West");
				}
			}

		}


	}

}
