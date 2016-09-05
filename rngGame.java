import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class rngGame {
	public static void main(String[] args) {
		
		Random randomObj;
		int someNum;
		Scanner scannerObj;
		int guess;
		int tries;
		int done;
		done = 0;
		

		randomObj = new Random();
		someNum = randomObj.nextInt(10) + 1;
		scannerObj = new Scanner(System.in);
		tries = 2;
		
		System.out.println("Hey! Wanna play a game?");
		System.out.println("I am thinking of a number...Hmmm....");
		System.out.println("Got it!");
		System.out.println("Now, try to guess the number (it is from 1 to 10) YOU HAVE 3 TRIES: ");
		
		while (tries >= 0) {
			guess = scannerObj.nextInt();
			
			if (guess == someNum) {
				System.out.println("Correct! Nice job.");
				done = 1;
				break;
			}
			
			else if (guess < someNum) {
				System.out.println("Sorry. Your number is too low. ");
			}
			
			else if (guess > someNum) {
				System.out.println("Sorry. Your number is too high. ");
			}
			
			if (tries > 0) {
				 System.out.println("Try again :D (you have " + tries + " tries left) ");
			}
			
			tries -= 1;
		}
		if (done == 0) {
			System.out.println("You have run out of tries!");
		}
	}
}
