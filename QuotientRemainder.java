package basicjavaprograms;

import java.util.Scanner;

public class QuotientRemainder {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Dividend");
		int dividend = scanner.nextInt();
		System.out.println("Enter a Divider");
		int divider = scanner.nextInt();
		System.out.println(divider);
		int quotient = dividend / divider;
		int remainder = dividend % divider;
		System.out.println("Quotient is " + quotient);
		System.out.println("Remainder is " + remainder);
	}
}

