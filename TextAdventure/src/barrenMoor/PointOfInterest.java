package barrenMoor;

import java.util.ArrayList;

public class PointOfInterest{

	private static ArrayList<Objects> poi;
	
	public void addToPointOfInterest(Objects o) {
		Objects.add(o);
	}

	

	public PointOfInterest() {
		
		Objects end = new Objects("Game Over", 10,10,"You have found a way back congratulations!!!",false);
		Objects compassDistance = new Objects("Compass",0,1,"This magical compass is able to show you the distance to the nearest point of interest",false);
		Objects compassDirection = new Objects("Compass",2,2,"This magical compass is able to show you the dierction to the nearest point of interest, type compass to check",false);
		Objects shoes = new Objects("pair of Shoes", 10,-12,"You can now run with these shoes",false);
		setPoi(new ArrayList<>());
		getPoi().add(end);
		getPoi().add(compassDistance);
		getPoi().add(compassDirection);
		getPoi().add(compassDistance);
		getPoi().add(shoes);
		
		
}
	
	public Objects getObject(int i) {
		return getPoi().get(i);
	}


	public static ArrayList<Objects> getPoi() {
		return poi;
	}



	public void setPoi(ArrayList<Objects> poi) {
		PointOfInterest.poi = poi;
	}



	public Object setObject(int i) {
		return null;
	}



	public void remove(int i) {
		poi.remove(i);
		
	}
	
	
	
		
	
	}


