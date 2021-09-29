package basicjavaprograms;

import java.util.Scanner;

public class FlipCoin {
	public static void main(String[] args) {
		final int HEADS = 1,TAILS = 0;
		int headsCount = 0;
		int tailsCount = 0;
		int counter=1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number of Times you want to Flip coin :");
		int noOfFlips = scanner.nextInt();
		while(counter <= noOfFlips)
		{
			counter++;	
			int random = (int)Math.floor(Math.random() * 2);
			if(random == TAILS)
				tailsCount++;
			else if(random == HEADS)
				headsCount++;
		}
		System.out.println("Number of Times Heads comes :" + headsCount);
		System.out.println("Number of Times Tails comes :" + tailsCount);
		double tailsPercentage = (double)tailsCount / noOfFlips * 100;
		double headsPercentage = (double)headsCount / noOfFlips * 100;
		System.out.println("Heads Percentage is :" + headsPercentage);
		System.out.println("Tails Percentage is :" + tailsPercentage);
	}
}
