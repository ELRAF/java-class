//Rafael
//08/16/16
//day1Review.java

import java.util.Scanner;

public class day1Review {
	
	public static void main(String[] args) {
		
		// This is a Print statement
		System.out.println("This is a print statement lulz");
		
		// This is how we assign a value to a variable
		String name;
		name = "Raf";
		// or String name = "Raf";
		int ageC = 15;
		
		System.out.println(name + " is " + ageC + "!");
		
		
		// User Input
		Scanner scannerObj;
		String playerName;
		int year;
		int age;
		int temp;
		String sky;
		
		scannerObj = new Scanner(System.in);
		
		
		System.out.println("So now you know my name. What's yours? ");
		playerName = scannerObj.nextLine();
		
		System.out.println("So, your name is " + playerName + ". Well " + playerName + "!");
		if (playerName.equals(name)) {
			System.out.println("...");
			System.out.println("It looks like we have the same name! Wow, that may get a little confusing...");
		}
		
		else {
			System.out.println("I like that name...");
		}
		System.out.println("Anyway!");
		
		
		/*
		age = 10;
		year = 22202;
		
		temp = 80;
		sky = "rainy";
		
		if (age == 10 && year == 2016) {
			System.out.println("Welcome to the future 10 year old.");
		}
		
		else {
			System.out.println("Not in the cool 10 kid club, and you're so " + year + "...");
		}
		
		if (temp == 80 || sky == "rainy") {
			System.out.println("Beach day! It is " + temp + " degrees and " + sky);
		}
		else {
			System.out.println("No beach for me!");
		}
		
		
		int age;
		
		age = 1;
		
		if (age > 10) {
			System.out.println("You're mad old dude!");
		}
		
		else if (age < 10) {
			System.out.println("You are way young babyboi");
		}
		
		else {
			System.out.println("10 years old huh? That's the best age dawg");
		}
		*/
	}
	
}
