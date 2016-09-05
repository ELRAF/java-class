//Rafael
//08/18/16
//day4Review.java

public class day3Review {
	public static void main(String[] args) {
		// Covered: Loops (for loops, while loops), arrays (int[], String[])
		
		int sum;
		int x;
		
		x = 0;
		
		// For loop
		
		for (int i = 0; i < 10; i++) {
			
			// System.out.println(i + 1);
			sum = i * 5;
			
			System.out.println(sum);
			
		}
		
		// While loop
		
		while (true) {		
			if (x > 10) {
				break;
			}
			
			else {
				
				x = x + 2;
				System.out.println(x);
			}
		}
		
		// Arrays
		
		int[] intArr;
		String[] stringArr;
		
		intArr = new int[2];
		
		intArr[0] = 200000;
		intArr[1] = 456;
		
		for (int i = 0; i < intArr.length; i++) {
			
			System.out.print(intArr[i] + " ");
			
		}
		
	}
}
