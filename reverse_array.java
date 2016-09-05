//Rafael
//08/17/16
//reverse_array.java

import java.util.Arrays;

public class reverse_array {
	public static void main(String[] args) {
		
		// Initialize variables
		int[] reg_array;
		int[] rev_array;
		
		// Define variables
		reg_array = new int[1];
		rev_array = new int[reg_array.length];
		
		// Fill up spaces in Array
		reg_array[0] = 1;
		reg_array[1] = 2;
		reg_array[2] = 3;
		reg_array[3] = 4;
		reg_array[4] = 5;
		reg_array[5] = 6;
		reg_array[6] = 7;
		reg_array[7] = 8;
		reg_array[8] = 9;
		reg_array[9] = 10;
		
		// Reverse array
		for (int place = 0, len = reg_array.length -1; len >= 0; place++, len--) {
			rev_array[place] = reg_array[len];
		}
		
		// Print arrays 
		System.out.println(Arrays.toString(reg_array));
		System.out.println(Arrays.toString(rev_array));
	}
}
