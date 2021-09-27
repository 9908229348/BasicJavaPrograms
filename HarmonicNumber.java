package basicjavaprograms;

import java.util.Scanner;

public class HarmonicNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int valueN = scanner.nextInt();
		double harmonic = 0;
		int count;
		for(count = 1;count <= valueN;count++)
		{
			harmonic = harmonic +(double) 1 / count;
		}
	System.out.println(valueN + " Harmonic value is : " + harmonic);
	}
}

