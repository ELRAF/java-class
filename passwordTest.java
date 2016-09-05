//Rafael
//08/16/16
//passwordTest.java

import java.util.Scanner;

public class passwordTest {
	public static void main(String[] args) {
		
		Scanner scannerObj;
		String userName;
		String userPassword;
		String entName;
		String entPass;
		
		userPassword = "helloworld";
		userName = "Raf";
		
		scannerObj = new Scanner(System.in);
		
		while (true) {
			System.out.print("Enter your username: ");
			entName = scannerObj.nextLine();
			
			System.out.print("Enter your password: ");
			entPass = scannerObj.nextLine();
			
			if (entPass.equals(userPassword) && entName.equals(userName)) {
				System.out.println("Your login is correct!\nWelcome!");
			}
			
			else {
				System.out.println("Sorry. that is incorrect. Please try again.");
			}
		}
	}
}
