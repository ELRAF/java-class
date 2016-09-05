//Rafael
//08/18/16
//bike.java

public class bike {
	public int cadence;
	public int gear;
	public int speed;
	public String color;
	
	public bike (int startCadence, int startSpeed, int startGear, String startColor) {
		gear = startGear;
		cadence = startCadence;
		speed = startSpeed;
		color = startColor;
	}
	public void setCadence (int newValue) {
		cadence = newValue;
	}
	public void setGear (int newValue) {
		gear = newValue;
	}
	public void applyBrake (int decrement) {
		speed -= decrement;
	}
	public void speedUp (int increment) {
		speed += increment;
	}
	public void changeColor (String newColor) {
		color = newColor;
	}
}