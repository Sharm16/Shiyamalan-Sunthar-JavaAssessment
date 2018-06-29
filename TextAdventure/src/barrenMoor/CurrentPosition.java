package barrenMoor;


// This class will hold information on where the player currently is


public class CurrentPosition extends Location {
	
	private static double xAxis=0;
	private static double yAxis=0;
	
	public CurrentPosition(double xAxis, double yAxis ) {
		
		CurrentPosition.xAxis=xAxis;
		CurrentPosition.yAxis=yAxis;
		
	}

	public static void setxAxis(double xAxis) {
		CurrentPosition.xAxis = xAxis;
	}

	public static void setyAxis(double yAxis) {
		CurrentPosition.yAxis = yAxis;
	}

	public static double getxAxis() {
		return xAxis;
	}

	public static double getyAxis() {
		return yAxis;
	}
	

}
