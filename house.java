//Rafael
//08/18/16
//house.java

public class house {
	
	public int windowNumber;
	public int doorNumber;
	public String color;
	public String floorType;
	public String roofColor;
	public boolean locked;
	
	public house (int newWindowNumber, int newDoorNumber, String newColor, String newFloorType, String newRoofColor, boolean ifLocked) {
		windowNumber = newWindowNumber;
		doorNumber = newDoorNumber;
		color = newColor;
		floorType = newFloorType;
		roofColor = newRoofColor;
		locked = ifLocked;
	}
	
	public void changeColor (String newValue) {
		color = newValue;
	}
	public void lockDoor () {
		locked = true;
	}
	public void unlockDoor () {
		locked = false;
	}
	public void changeWindowNumber (int newNum) {
		windowNumber = newNum;
	}
	public void changeDoorNumber (int newNum) {
		doorNumber = newNum;
	}
}
