package lab4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		int number = 0;
		try {
			do {
				Scanner n = new Scanner(System.in);
				System.out.println("Please enter a number or enter ‘-1’ if you want to quit");
				number = n.nextInt();
				evenorodd(number);
			} while (number != -1);

		} catch (InputMismatchException e) {
			System.out.println("you must enter an integer");
		}

	}
	private static void evenorodd(int num) {
		if (num % 2 == 0) {
			System.out.println("You have entered an even number");
		} else if (num % 2 != 0) {
			System.out.println("You have entered an odd number");
		} else {
			System.exit(0);
		}
	}
}