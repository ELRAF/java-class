//Rafael
//08/18/16
//methods.java

public class methods {
	
	public static int doubleMyNum (int someNumber) {
		
		int result;
		
		result = someNumber * 2;
		
		return result;
	}
	
	public static int squareMyNum (int origNum) {
		
		int square;
		
		square = origNum * origNum;
		
		return square;
	}

	public static int someArrNum (int someArr[]) {
		
		int sum;
		sum = 0;
		
		for (int i = 0; i < someArr.length; i++) {
			sum = sum + someArr[i];
		}
		
		return sum;
		
	}
	
	public static void main(String[] args) {
		
		int pizza;
		int squarePizza;
		
		pizza = doubleMyNum(10);
		
		squarePizza = squareMyNum(pizza);
		
		System.out.println(pizza);
		System.out.println(squarePizza);
		
		int[] arr;
		arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int youChoose = someArrNum(arr);
		
		System.out.println(youChoose);
		
		
	}
}
