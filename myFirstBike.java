//Rafael
//08/18/16
//myFirstBike.java



public class myFirstBike {
	
	public static void main (String[] args) {
		bike bikeObj;
		bike bikeObj2;
		
		bikeObj = new bike(1, 1, 0, "Red");
		bikeObj2 = new bike(2, 2, 0, "Blue");
		
		System.out.println(bikeObj.color);
		
		bikeObj.changeColor("Black");
		
		System.out.println(bikeObj.color);
	}
	
}
