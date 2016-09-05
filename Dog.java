//Rafael
//08/19/16
//day4Review.java

public class Dog {
	
	public String furColor;
	public String type;
	public int age;
	public String gender;
	public int size; // In pounds
	
	public Dog (String newFurColor, String newType, String newGender, int newAge, int newSize) {
		
		furColor = newFurColor;
		type = newType;
		age = newAge;
		gender = newGender;
		size = newSize;
		
	}
	// eat
	// wag tail
	// poop
	// run
	// sleep
	// jump
	// bark
	// swin
	
	public void eat (int someFoodWeight) {
		size += someFoodWeight;
	}
	
	public void poop (int somePoopWeight) {
		size += somePoopWeight;
	}
	
	public void bark () {
		System.out.println("WOOF!");
	}
	
	public void increaseAge (int numYears) {
		age += numYears;
	}
	
}
