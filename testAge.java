import java.util.Scanner;

//Rafael
//08/15/16
//testAge.java


public class testAge {
	public static void main(String[] args) {
		System.out.println("Hey!");
		
		Scanner scannerObj = new Scanner(System.in);
		
		System.out.println("What is your age? ");
		String ageS = scannerObj.nextLine();
		int age = 2;
		if (age > 18) {
			System.out.println("");
		}
			
		else if (age == 15) {
			System.out.println("Same bro");
		}
		
		else {
			System.out.println("Youngster.");
		}
	}
}
