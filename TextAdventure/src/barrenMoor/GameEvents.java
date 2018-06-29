package barrenMoor;



//This class is for the events that can take place when the player reaches a location of interest

public class GameEvents extends CurrentPosition {
	static PointOfInterest poi = new PointOfInterest();
	public GameEvents(double xAxis, double yAxis) {
		super(xAxis, yAxis);
		
	}
	
	public static void checkItemFound() {
		
		

		for (int i = 0; i < PointOfInterest.getPoi().size(); i++) {
			if (getxAxis() == poi.getObject(0).xAxis && getyAxis() == poi.getObject(0).yAxis) { // if you land where the game ends
				System.out.println(poi.getObject(0).description);
				
			}
			else if (getxAxis() == poi.getObject(i).xAxis && getyAxis() == poi.getObject(i).yAxis) { // if you land on a point of interest
				if (poi.getObject(i).access == false) {
					poi.getObject(i).access=true;//not working				
					System.out.println("You have found a " + poi.getObject(i).name
							+ " It will now be automatically used"+"\n"+poi.getObject(i).description);
				}
			}

		}

	}

}
