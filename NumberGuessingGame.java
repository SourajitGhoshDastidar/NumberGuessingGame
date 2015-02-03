package numberGuessingGame;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String args[]) {

		Random rand = new Random();
		int guessedNumber = rand.nextInt(Integer.MAX_VALUE);
		int lowLimit = 0;
		int highLimit = Integer.MAX_VALUE;

		Boolean rightGuess = false;
		System.out
				.println("Please type ****ready**** if you are set to begin the game");
		Scanner in = new Scanner(System.in);
		String input = in.next();

		if (input.equals("ready")) {

			while (rightGuess == false) {
				System.out.println("Is the number " + guessedNumber + "?");
				Scanner answerScanner = new Scanner(System.in);
				String answer = answerScanner.next();

				if (answer.equals("end"))
					System.exit(0);
				else if (answer.equals("yes")) {

					System.out.println("I won");
					System.exit(0);
				}

				else if (answer.equals("higher")) {
					lowLimit = guessedNumber;
					guessedNumber = middleValueReturn(lowLimit, highLimit);
				}

				else if (answer.equals("lower")) {
					highLimit = guessedNumber;
					guessedNumber = middleValueReturn(lowLimit, highLimit);
				}

				else {
					System.out.println("Wrong Input....exiting");
					System.exit(0);
				}
			}

		} else {
			System.out.println("Wrong input...exiting");
			System.exit(0);
		}

	}

	public static int middleValueReturn(int low, int high) {

		return (low + high) / 2;
	}

}
