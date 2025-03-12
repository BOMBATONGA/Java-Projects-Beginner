package game;

import java.util.Scanner;

public class Announcer {
	public static void Welcome() {
		System.out.println("Welcome to the Number Guessing Game!");
		System.out.println("I'm thinking of a number between 1 and 100.\n\n");
	}
	
	public static int Difficulty() {
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Please choose the difficulty:");
		System.out.println("1. Easy (10 chances)");
		System.out.println("2. Medium (5 chances)");
		System.out.println("3. Hard (3 chances)\n");
		
		int  choice;
		do {
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();
			
			switch (choice){
				case 1:
					System.out.println("\nGreat! You have selected the Easy difficulty level.\n");
					return 10;
				case 2:
					System.out.println("\nGreat! You have selected the Medium difficulty level.\n");
					return 5;
				case 3:
					System.out.println("\nGreat! You have selected the Hard difficulty level.\n");
					return 3;
				default:
					System.out.println("\nPlease choose between 1 and 3.");
			}
		}while(choice < 1 || choice > 3);
		
		return 0;
	}
	
	public static void Victory(int tries) {
		System.out.println("Congratulations! You guessed the correct number in " + tries + " tries.\n");
	}
	
	public static void Loss(int randomNumber) {
		System.out.println("You lost! The correct number was " + randomNumber + ".\n");
	}
	
	public static int TryAgain(int tries) {
		Scanner scanner = new Scanner(System.in);
		int userReplay =-1;
		
		System.out.println("High score: " + tries + ".");
		
		System.out.println("Try again? (1 = Yes, 0 = No)");
		while(userReplay != 0 && userReplay != 1) {
			userReplay = scanner.nextInt();
		}
		return userReplay;
	}
	
	public static void GoodBye() {
		System.out.println("Thanks for playing my game!");
	}
}
