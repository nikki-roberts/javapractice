import java.util.Scanner;
import java.util.Random;

class Guess {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random generator = new Random();

		int number = generator.nextInt(1000) + 1;

		for (int i=0; i<7; i++) {
			System.out.println("Guess a number: ");
			int guess = scanner.nextInt();

			if (guess == number) {
				System.out.println("You are correct!!");
				i = 8;
			} else {
				if (guess > number) {
					System.out.println("You guessed too high.");
				} else {
					System.out.println("You guessed too low.");
				}
			}

		}
			
	}

}