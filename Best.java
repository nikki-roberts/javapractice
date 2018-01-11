import java.util.Scanner;

class Best {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Type a number: ");
		int x = scanner.nextInt();

		for (int i=0; i<x; i++) {
			System.out.println("YOU'RE THE BEST!!");
		}
	}

}