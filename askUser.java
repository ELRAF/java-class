//Rafael
//08/15/16
//askUser.java

import java.util.Scanner;

public class askUser {
	public static void main(String[] args) {
		System.out.println("Hey!");
		
		Scanner scannerObj = new Scanner(System.in);
		
		System.out.println("What is your name? ");
		String name = scannerObj.nextLine();
		
		System.out.println("How old are you? ");
		String age = scannerObj.nextLine();
		
		System.out.println("What grade are you in? ");
		String grade = scannerObj.nextLine();
		
		System.out.println("What is your favorite color? ");
		String color = scannerObj.nextLine();
		
		System.out.println("Awesome, " + name + "! I see you are " + age + " years old. Is grade " + grade + " fun? I also love the color " + color + ". I see we have a lot in common! (But not really) \nHey " + name + ", maybe we could be friends!" );
	}
}
