package basicjavaprograms;

import java.util.Scanner;

public class SwappingNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter numberOne value");
		int numberOne = scanner.nextInt();
		System.out.println("Enter numberTwo value");
		int numberTwo = scanner.nextInt();
		numberOne = numberOne + numberTwo;
		numberTwo = numberOne - numberTwo;
		numberOne = numberOne - numberTwo;
		System.out.println("After Swapping numberOne is :" + numberOne + " numberTwo is :" + numberTwo);
	}
}

