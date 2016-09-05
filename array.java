//Rafael
//08/17/16
//array.java

import java.util.Scanner;

public class array {
	
	public static void main (String[] args) {
		
		int[] arr;
		
		arr = new int[5];
		
		arr[0] = 22;
		
		System.out.println(arr[0]);
		
		int[] userAges;
		Scanner scannerObj;
		String mySentence[];
		String[] myPeople;
		String[] colors;
		String[] things;
		
		scannerObj = new Scanner(System.in);
		userAges = new int[10];
		
		System.out.print("Enter your age: ");
		userAges[0] = scannerObj.nextInt();
		
		System.out.println(userAges[0]);
		
		myPeople = new String[4];
		colors = new String[5];
		things = new String[5];
		mySentence = new String[6];
		
		myPeople[0] = "Wut";
		myPeople[1] = "Hello";
		myPeople[2] = "Bab";
		myPeople[3] = "nyehehehe";
		
		colors[0] = "black";
		colors[1] = "red";
		colors[2] = "yellow";
		colors[3] = "blue";
		colors[4] = "green";
		
		things[0] = "banana";
		things[1] = "turtle";
		things[2] = "penguin";
		things[3] = "computer";
		things[4] = "life";
		
		
		System.out.println(myPeople[0] + " likes the color " + colors[0] + " and likes eating " + things[0] + "s.");
		System.out.println(myPeople[2] + " hates the color " + colors[2] + " and likes riding " + things[1] + "s.");
		System.out.println(myPeople[3] + " loves " + colors[4] + " " + things[3] + "s.");
		
		
		mySentence[0] = "I";
		mySentence[1] = "became";
		mySentence[2] = "a";
		mySentence[3] = "big";
		mySentence[4] = "fat";
		mySentence[5] = "butterfly.";
		
		int i = mySentence.length -1 ;
		
		while (i >= 0) {
			System.out.println(mySentence[i]);
			i--;
		}
		
	}
	
}
