package barrenMoor;


//This class is to describe how each object around the world will be defined
public class Objects extends Location{
	
	String name;
	double xAxis;
	double yAxis;
	String description;
	boolean access;

	public Objects(String name, double xAxis,double yAxis, String description,Boolean access) {
		this.name=name;
		this.xAxis=xAxis;
		this.yAxis=yAxis;
		this.description=description;
		this.access=access;
		
	}
	
	@Override
	public String toString(){
        return name +" " +xAxis+" " +yAxis+" "+ description+" "+access;
    }

	public static void add(Objects o) {

	}
	

}
