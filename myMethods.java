//Rafael
//08/18/16
//myMethods.java

import java.util.Scanner;



public class myMethods {
	public static void calcUserStuff (String name, int age, int grade, int futureNum) {
		int ageInY;
		int gradeInY;
		String gradeInYS;
		String specMsg;
		
		ageInY = age + 5;
		gradeInY = grade + 5;
		
		if (gradeInY > 8 && gradeInY <= 12) {
			gradeInYS = (gradeInY - 8) + " years into highschool";
		}
		
		else if (gradeInY > 12) {
			if (gradeInY - 12 > 6) {
				specMsg = " (if you are even still in college!)";
			}
			else {
				specMsg = ".";
			}
			gradeInYS = (gradeInY - 12) + " years into college" + specMsg;
		}
		
		else if (gradeInY > 20) {
			gradeInYS = " you will have been in school for quite a while";
		}
		
		else {
			gradeInYS = " in grade" + gradeInY;
		}
		
		System.out.println ("You are " + name + ", and you are " + age + " years old. You will be " + ageInY + " in 5 years and " + gradeInYS + ".");
	}
	
	public static void main (String[] args) {
		
		Scanner scannerObj = new Scanner(System.in);
		
		System.out.println("What is your name? ");
		String name = scannerObj.nextLine();
		System.out.println("What is your age? ");
		int age = scannerObj.nextInt();
		System.out.println("What is your grade? ");
		int grade = scannerObj.nextInt();
		
		calcUserStuff(name, age, grade, 5);
		
	}
}
