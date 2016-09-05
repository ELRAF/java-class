//Rafael
//08/15/16
//input.java

import java.util.Scanner;

public class input {
	
	public static void main(String[] args) {
		
		Scanner scannerObj = new Scanner(System.in);
		
		System.out.println("What is your favorite color? ");
		String color = scannerObj.nextLine();
		
		System.out.println("What is your name? ");
		String name = scannerObj.nextLine();
		
		System.out.println("Your name is " + name + ". Thats a great name!\nAnd your favorite color is " + color + "... mine too!");
		
		
	}
}
