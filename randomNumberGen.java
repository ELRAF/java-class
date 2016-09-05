//Rafael
//08/16/16
//randomNumberGen.java

import java.util.Random;

public class randomNumberGen {
	
	public static void main(String[] args) {
		
		Random randomObj;
		int someNum;
		
		randomObj = new Random();
		someNum = randomObj.nextInt(10) + 1;
		
		System.out.println(someNum);
		
	}
	
}
