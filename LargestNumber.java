package basicjavaprograms;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Numbers :");
		int numberOne = scanner.nextInt();
		int numberTwo = scanner.nextInt();
		int numberThree = scanner.nextInt();
		if(numberOne > numberTwo && numberOne > numberThree)
			System.out.println("Largest Number is :" + numberOne);
		else if(numberTwo > numberOne && numberTwo > numberThree)
			System.out.println("Largest Number is :" + numberTwo);
		else
			System.out.println("Largest Number is :" + numberThree);
	}
}


