
import java.util.Scanner;

public class dogMain {
	public static void main (String[] args) {
		Scanner scannerObj;
		scannerObj = new Scanner(System.in);
		
		Dog dogObj;
		dogObj = new Dog("Golden", "Labdoodle", "Male", 2, 40);
		
		System.out.println(dogObj.type);
		
		boolean hungry = false;
		
		System.out.println("What time is it? Adventure time? ");
		String time = scannerObj.nextLine();
		
		if (time.equals("12:00 PM")) {
				hungry = true;
		}
		
		if (hungry) {
			dogObj.bark();
			dogObj.eat(2);
			
			System.out.println(dogObj.size);
		}
	}
}
